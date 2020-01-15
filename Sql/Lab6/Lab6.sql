-- Task 1
drop procedure division_matches_played;

CREATE PROCEDURE division_matches_played (divcode char(2))
begin
	select division.description as Division, count(*) as Matches 
	from division inner join `match` on division.division_code=`match`.division_code 
	where division.division_code = divcode and winner_player_number is not null;
end;

call division_matches_played('PF');

-- Task 2
drop procedure player_matches;

CREATE PROCEDURE player_matches (fname varchar(50))
begin
	select match_id
	from `match` 
	inner join `member` on `match`.player1_number = `member`.player_number 
	inner join `member` as m2 on `match`.player2_number = m2.player_number
	where `member`.first_name = fname;
end;

call player_matches('Sam');


-- Task 3
drop procedure add_match;

CREATE PROCEDURE add_match (fname varchar(50), lname varchar(50), date (date))
begin

	
	
	
end;

call add_match('');


