INSERT INTO DIVISION 
(DivisionCode, DivisionDescription)
VALUES 
('AM','Amateur Male'),
('AF','Amateur Female'),
('SM','Senior Male'),
('SF','Senior Female'),
('PM','Professional Male'),
('PF','Professional Female');

	
INSERT INTO PLAYER 
(PlayerNumber,PlayerFirstName,PlayerLastName,PlayerBirthdate,PlayerGender,PlayerPhone,PlayerEmail,PlayerYearJoined,DIVISION_DivisionCode)
VALUES

(001,'Aaron','Blue','1981-01-03','M','705-575-1370','blue.aaron@gmail.com',2017,null),
(002,'Amber','Blue','1984-10-02','F','705-575-1370','amber.blue@gmail.com',2017,null),
(003,'Evan','Dupuis','1984-03-23','M','705-575-1370','evan@gmail.com',2018,null),
(004,'Abigail','Dupuis','1985-10-02','F','705-575-1370','abigail@gmail.com',2017,null),
(005,'Jesse','Woods','1989-01-03','M','705-575-1370','jesse@gmail.com',2017,null),
(006,'Ethan','Sachro','1980-10-02','F','705-575-1370','ethan@gmail.com',2018,null),
(007,'Gail','MacDonald','1982-01-03','M','705-575-1370','gail@gmail.com',2018,null),
(008,'Helen','Walkerley','1983-10-02','F','705-575-1370','helen@gmail.com',2017,null),
(009,'Alan','Fife','1979-01-03','M','705-575-1370','alan@gmail.com',2017,null),

(010,'Samson','Carroll','1976-01-01','M','705-575-1370','samson@gmail.com',2017,'PM'),
(011,'Duane','Houle','1976-01-01','M','705-575-1370','duane@gmail.com',2017,'PM'),
(012,'Ryan','Down','1976-01-01','M','705-575-1370','ryanD@gmail.com',2017,'PM'),
(013,'Ryan','Kirkey','1976-01-01','M','705-575-1370','ryan@gmail.com',2017,'PM'),
(014,'Clayton','OToole','1976-01-01','M','705-575-1370','clayton@gmail.com',2018,'PM'),
(015,'Stephan','OToole','1976-01-01','M','705-575-1370','stephan@gmail.com',2017,'PM'),

(016,'Morgan','Carroll','1976-01-01','M','705-575-1370','morgan@gmail.com',2017,'AM'),
(017,'Jason','Houle','1976-01-01','M','705-575-1370','Jason@gmail.com',2018,'AM'),
(018,'Fred','Carrella','1976-01-01','M','705-575-1370','Fred@gmail.com',2018,'AM'),
(019,'Dave','Fave','1976-01-01','M','705-575-1370','clayton@gmail.com',2017,'AM'),
(020,'Barney','Fife','1976-01-01','M','05-575-1370','stephan@gmail.com',2017,'AM'),
(021,'Herman','Head','1976-01-01','M','705-575-1370','Herman@gmail.com',2018,'AM'),

(022,'Amy','Carroll','1976-01-01','F','705-575-1370','morgan@gmail.com',2017,'PF'),
(023,'Aarin','Houle','1976-01-01','F','705-575-1370','Jason@gmail.com',2017,'PF'),
(024,'Aimee','Carr','1976-01-01','F','705-575-1370','Fred@gmail.com',2017,'PF'),
(025,'Sarah','Beam','1976-01-01','F','705-575-1370','clayton@gmail.com',2017,'PF'),
(026,'Ethel','Good','1976-01-01','F','705-575-1370','stephan@gmail.com',2017,'PF'),
(027,'Laura','Head','1976-01-01','F','705-575-1370','Herman@gmail.com',2017,'PF'),

(028,'Crystal','Wagner','1976-01-01','F','705-575-1370','morgan@gmail.com',2018,'AF'),
(029,'Mara','Houle','1976-01-01','F','705-575-1370','Jason@gmail.com',2017,'AF'),
(030,'Suzy','Carrella','1976-01-01','F','705-575-1370','Fred@gmail.com',2017,'AF'),
(031,'Sarah','Jones','1976-01-01','F','705-575-1370','clayton@gmail.com',2017,'AF'),
(032,'Edith','Temp','1976-01-01','F','705-575-1370','stephan@gmail.com',2017,'AF'),
(033,'Barbara','Head','1976-01-01','F','705-575-1370','Herman@gmail.com',2018,'AF'),


(034,'Steve','Carroll','1976-01-01','M','705-575-1370','morgan@gmail.com',2017,'SM'),
(035,'Paul','Houle','1976-01-01','M','705-575-1370','Jason@gmail.com',2017,'SM'),
(036,'Jacob','Carr','1976-01-01','M','705-575-1370','Fred@gmail.com',2017,'SM'),
(037,'Bill','Oddman','1976-01-01','M','705-575-1370','clayton@gmail.com',2017,'SM'),
(038,'Will','Sill','1976-01-01','M','705-575-1370','stephan@gmail.com',2017,'SM'),
(039,'Frank','Bank','1976-01-01','M','705-575-1370','Herman@gmail.com',2017,'SM'),

(040,'Isabel','Carroll','1976-01-01','F','705-575-1370','morgan@gmail.com',2017,'SF'),
(041,'Amber','Houle','1976-01-01','F','705-575-1370','Jason@gmail.com',2017,'SF'),
(042,'Lucy','Carr','1976-01-01','F','705-575-1370','Fred@gmail.com',2018,'SF'),
(043,'Yasmin','Ochoski','1976-01-01','F','705-575-1370','clayton@gmail.com',2017,'SF'),
(044,'Jasmin','Rent','1976-01-01','F','705-575-1370','stephan@gmail.com',2018,'SF'),
(045,'Percilla','Mead','1976-01-01','F','705-575-1370','Herman@gmail.com',2017,'SF');

 
INSERT INTO `MATCH` 
(MatchDate,PLAYER_MatchPlayer1Number,PLAYER_MatchPlayer2Number,PLAYER_MatchWinningPlayerNumber, MatchWinningPlayerSetsWon, DIVISION_DivisionCode )
VALUES
('2017-01-14',015,011,015,2,'PM'),
('2017-01-14',012,010,010,3,'PM'),
('2017-02-15',015,012, null,null,'PM'),
('2017-02-15',015,011,null,null,'PM'),

('2017-01-14',016,021,021,2,'AM'),
('2017-04-14',017,020,017,3,'AM'),
('2017-01-15',018,019,018,2,'AM'),
('2017-03-15',016,017,017,2,'AM'),

('2017-01-14',022,023,022,2,'PF'),
('2017-01-14',024,025,025,3,'PF'),
('2017-02-15',026,027,null,null,'PF'),
('2017-02-15',022,024,null,null,'PF'),

('2017-01-14',028,029,028,2,'AF'),
('2017-02-14',030,031,null,null,'AF'),
('2017-04-15',028,029,null,null,'AF'),
('2017-02-15',030,031,null,null,'AF'),

('2017-01-14',034,035,035,2,'SM'),
('2017-01-14',036,037,037,3,'SM'),
('2017-01-15',038,039,039,2,'SM'),
('2017-01-15',034,036,036,2,'SM'),

('2017-01-14',040,041,041,2,'SF'),
('2017-01-14',042,043,042,3,'SF'),
('2017-01-15',044,045,045,2,'SF'),
('2017-02-15',040,041,null,null,'SF');
	

INSERT INTO COACH_ASSIGNMENT
(PLAYER_CoachPlayerNumber,PLAYER_CoacheePlayerNumber)
VALUES
(010,016),
(011,018),
(014,018),
(022,028),
(025,029),
(022,031),
(023,028),
(014,036),
(011,037),
(022,040),
(023,043);