

-- Task 3 solutions
-- Q1
select * from Player;

-- Q2
select  PlayerFirstName from player;

-- Q3
select count(PlayerFirstName)
from player;

-- Q4
SELECT DISTINCT PlayerGender FROM player;

-- Q5
SELECT * FROM player
WHERE PlayerGender='M' and (PlayerFirstName='Will' or PlayerFirstName='Paul');

SELECT * FROM player
WHERE PlayerFirstName LIKE 'a%';

SELECT * FROM player
WHERE PlayerFirstName IN ('Will', 'Paul', 'Jasmin');

SELECT * FROM `match`
WHERE  MatchDate BETWEEN '2017-01-14' AND '2017-04-14';

-- Q6
SELECT * FROM player
ORDER BY PlayerLastName asc;

-- Q7
SELECT * FROM player
ORDER BY PlayerLastName asc limit 1 offset 2 ;
