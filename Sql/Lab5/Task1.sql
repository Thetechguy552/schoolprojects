-- Task1
-- Q1
alter table recreational_member
RENAME to `member`;

INSERT INTO `member`(player_number, first_name, last_name, sex, year_joined, phone, email)
SELECT player_number, first_name, last_name, sex, year_joined, phone, email
FROM competitive_member;

alter table competitive_member
drop column first_name,
drop column last_name,
drop column sex,
drop column year_joined,
drop column phone,
drop column email;

alter table competitive_member
add constraint fk_playernumber foreign key (player_number) references `member`(player_number);

-- Q2
alter table `member`
ADD active bit not null;

update `member` 
set active = 0
where year_joined < 2014;

update `member` 
set active = 1
where year_joined > 2014;
