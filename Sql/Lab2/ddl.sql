DROP DATABASE IF EXISTS csd220_lab2;
CREATE DATABASE csd220_lab2 CHARACTER SET utf8mb4;

USE csd220_lab2; 

DROP table if exists DIVISION;
create table DIVISION (
	DivisionCode char(2) not null primary key,
	DivisionDescription char(25) not null
);

DROP table if exists PLAYER;
create table PLAYER
(
	PlayerNumber int not null primary key auto_increment,
	PlayerFirstName char(25) not null,
	PlayerLastName char(25) not null,
	PlayerBirthDate date not null,
	PlayerGender char not null,
	PlayerPhone char(12) not null,
	PlayerEmail char(50) not null,
	PlayerYearJoined year(4) not null,
	DIVISION_DivisionCode char(2) null,
	FOREIGN KEY (DIVISION_DivisionCode) REFERENCES DIVISION(DivisionCode)
);   
 				
DROP table if exists COACH_ASSIGNMENT;
create table COACH_ASSIGNMENT
(
	PLAYER_CoachPlayerNumber int  not null,
	PLAYER_CoacheePlayerNumber int null not null,
	FOREIGN KEY (PLAYER_CoachPlayerNumber) REFERENCES PLAYER (PlayerNumber),
	FOREIGN KEY (PLAYER_CoacheePlayerNumber) REFERENCES PLAYER (PlayerNumber)
);

DROP table if exists `MATCH`;
create table `MATCH`
(	
	MatchNumber int not null primary key auto_increment,
	MatchDate datetime not null,
	PLAYER_MatchPlayer1Number int null,
	PLAYER_MatchPlayer2Number int null,
	PLAYER_MatchWinningPlayerNumber  int null,
	MatchWinningPlayerSetsWon tinyint null,
    DIVISION_DivisionCode char(2) not null,
	FOREIGN KEY (PLAYER_MatchPlayer1Number) REFERENCES PLAYER (PlayerNumber),
	FOREIGN KEY (PLAYER_MatchPlayer2Number) REFERENCES PLAYER (PlayerNumber),
	FOREIGN KEY (PLAYER_MatchWinningPlayerNumber) REFERENCES PLAYER (PlayerNumber),
    FOREIGN KEY (DIVISION_DivisionCode) REFERENCES DIVISION (DivisionCode)
);


