create procedure get_match_percentages(divcode char(2))
begin
	declare p1, p2 int;

	declare cur cursor for
		select player1_number, player2_number
		from `match`
		where 
			division_code = divcode and
			winner_player_number is not null;
		
	create temporary table tmp ( player_num int )	
	open cur;
	the_loop: loop
		fetch cur into p1, p2;
		if curdone then leave the_loop;
		end if;
		set totalGames := totalGames + 1
		insert
		
		
	end loop;
end

player_num
_________

1
2
3
3
2
3
1
3
2