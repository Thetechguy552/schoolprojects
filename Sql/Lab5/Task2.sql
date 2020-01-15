-- Task2
-- Q1
update coach_assignment 
set coach_player_number = 105
where coach_player_number = 102;

--Q2
DELETE FROM `match` WHERE division_code like 'A%' or division_code like 'Y%' and `date` = '2019-03-17';

--Q3
CREATE VIEW active_member AS
SELECT player_number, first_name, last_name, sex, year_joined, phone, email
FROM `member`
WHERE active = 1;

select * from active_member;

--Q4

