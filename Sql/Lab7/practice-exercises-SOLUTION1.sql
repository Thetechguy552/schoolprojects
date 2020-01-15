use csd220_tennis_club_v2~


-- 1.1

drop function if exists rand_int~
create function rand_int(minimum int, maximum int) returns int
begin
	return minimum + floor(rand() * ( 1 + maximum - minimum ));
end~

select rand_int(1,3)~

-- 1.2

drop function if exists is_weekend~

create function is_weekend(d date) returns boolean
begin
	return dayofweek(d) = 1 or dayofweek(d) = 7;
end~

select is_weekend('2019-03-31')~

-- 1.3

drop function if exists unbigify~

create function unbigify(s varchar(10000)) returns varchar(10000)
begin
	declare curpos int default 1;
	declare spacepos int;
	declare nextword varchar(100);
	declare ret varchar(10000) default '';
	
	repeat
		
		set spacepos := locate(' ', s, curpos);
		
		if spacepos = 0 then set nextword := substring(s from curpos);
		else set nextword := substring(s from curpos for (spacepos - curpos) );
		end if;
		
		if char_length(nextword) <= 4 then set ret := concat(ret, nextword, ' ');
		end if;
		
		set curpos := spacepos + 1;
		
	until spacepos = 0
	end repeat;
	
	return ret;
end~

select unbigify('I am the very model of a modern major general')~
select unbigify('I')~
select unbigify('general')~

-- 1.4

drop function if exists get_name_of~

create function get_name_of(player_num int) returns varchar(200)
begin
	declare name varchar(200);
	select concat(first_name, ' ', last_name) into name from `member` where player_number = player_num;
	return name;
end~

select get_name_of(128)~

-- 2.1

drop trigger if exists check_player_number_on_insert~

create trigger check_player_number_on_insert before insert
	on `member` for each row
begin
		
	if NEW.player_number < 0 then
		signal sqlstate '45000' set message_text = 'Player numbers must be greater than 0';
	end if;
end~

insert into `member` values (-1, 'Rodney', 'Martin', 'M', 2019, '555.555.5555', 'r@example.com', 1)~
insert into `member` values (130, 'Rodney', 'Martin', 'M', 2019, '555.555.5555', 'r@example.com', 1)~

-- 2.2

drop trigger if exists prevent_active_player_deletion~

create trigger prevent_active_player_deletion before delete
	on `member` for each row
begin
	if OLD.active then
		signal sqlstate '45000' set message_text = 'You cannot delete an active player';
	end if;
end~

delete from `member` where player_number = 102~


-- 3.1

drop procedure if exists add_coach_assignment~

create procedure add_coach_assignment(coach_player_num int, coachee_player_num int)
begin
	declare msg varchar(500);
	
	if not exists( select * from `member` where player_number = coach_player_num ) then
		set msg := concat('Coach ', coach_player_num, ' does not exist');
		signal sqlstate '45000' set message_text = msg;
	end if;
	
	if not exists( select * from `member` where player_number = coachee_player_num ) then
		set msg := concat('Player ', coachee_player_num, ' does not exist');
		signal sqlstate '45000' set message_text = msg;
	end if;
	
	if exists ( select * from coach_assignment where coach_player_number = coach_player_num and coachee_player_number = coachee_player_num ) then
		signal sqlstate '45000' set message_text = 'This assignment already exists';
	end if;
	
	insert into coach_assignment values (coach_player_num, coachee_player_num);
	
	select 'Coach assignment added';
end~

call add_coach_assignment(105, 117)~


-- 3.2

drop procedure if exists player_sets_wins_losses~

create procedure player_sets_wins_losses(player_num int)
begin
	
	-- grab the player's name for later use in the message
	declare name varchar(200) default get_name_of(player_num);
	
	-- declare some variables we will need
	declare sets_won, sets_lost, total_sets_won, total_sets_lost int default 0;
	declare done bool default false;
	
	-- make a cursor that is a union of two simple queries...
	declare cur cursor for
		-- ... first, calculate the sets won and lost...
		select winner_sets_won as sets_won, 3 - winner_sets_won as sets_lost from `match`
		where ( player1_number = player_num or player2_number = player_num )
			and winner_player_number = player_num  -- ...for matches that the player won...
		union all
		-- ... then, calculate the sets won and lost...
		select 3 - winner_sets_won as sets_won, winner_sets_won as sets_lost from `match`
		where ( player1_number = player_num or player2_number = player_num )
			and winner_player_number <> player_num -- ...for matches that the player lost...
			and winner_player_number is not null
		;
		
	-- set a handler to catch the error that occurs when the cursor runs out fo data
	declare continue handler for not found set done = true;
			
	open cur;
	
		the_loop: loop
			
			fetch cur into sets_won, sets_lost;
			
			if done then leave the_loop;
			end if;
			
			set total_sets_won := total_sets_won + sets_won;
			set total_sets_lost := total_sets_lost + sets_lost;
			
		end loop;
	
	close cur;
		
	if total_sets_won > 0 or total_sets_lost > 0 then 
		select concat(name, ' has won ', total_sets_won, ' set(s)')
		union
		select concat(name, ' has lost ', total_sets_lost, ' set(s)');
	else
		select concat(name, ' has played no matches');
	end if;
	
end~

call player_sets_wins_losses(117)~

-- NOTE: A better (non-cursor) solution to the actual problem posed by 3.2 is shown below
create procedure player_sets_wins_losses(player_num int)
begin
	
	-- grab the player's name for later use in the message
	declare name varchar(200) default get_name_of(player_num);
	
	-- declare some variables we will need
	declare total_sets_won, total_sets_lost int;
	
	select sum(sets_won), sum(sets_lost) into total_sets_won, total_sets_lost
	from (
		select winner_sets_won as sets_won, 3 - winner_sets_won as sets_lost from `match`
		where ( player1_number = player_num or player2_number = player_num )
			and winner_player_number = player_num  -- ...for matches that the player won...
		union all
		-- ... then, calculate the sets won and lost...
		select 3 - winner_sets_won as sets_won, winner_sets_won as sets_lost from `match`
		where ( player1_number = player_num or player2_number = player_num )
			and winner_player_number <> player_num -- ...for matches that the player lost...
			and winner_player_number is not null
	) as subquery;
		
	if total_sets_won > 0 or total_sets_lost > 0 then 
		select concat(name, ' has won ', total_sets_won, ' set(s)')
		union
		select concat(name, ' has lost ', total_sets_lost, ' set(s)');
	else
		select concat(name, ' has played no matches');
	end if;
	
end~
