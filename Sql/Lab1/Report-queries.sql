-- Task 1
select name as 'Name', amount as 'Amount Pledged', address as 'Tax Information' from pledge where address is not null order by amount desc, name asc;
-- Task 2
select player.name as 'Player', team.name as 'Team' from team inner join player on player.team_id=team.id order by team.name asc, player.name asc;
-- Task 3
select Concat(t1.name, ' vs. ', t2.name) as 'Game', court as 'Court', gametime as 'Time' from game 
join team as t1 on t1.id = game.home join team as t2 on t2.id = game.away where gametime > '2018-11-21 11:00' order by gametime, court asc;
-- Task 4
select team.name as 'Team', sum(pledge.amount) as 'Donation' from team inner join player on player.team_id=team.id 
inner join pledge on pledge.Player_id=player.id group by team.name order by Donation desc;
-- Task 5
select team.name as 'Team', count(winner) - (5 - count(winner)) as 'Score', count(winner) as 'Wins', 5 - count(winner) as 'Losses' 
from game inner join team on team.id=game.winner group by winner order by Score desc;