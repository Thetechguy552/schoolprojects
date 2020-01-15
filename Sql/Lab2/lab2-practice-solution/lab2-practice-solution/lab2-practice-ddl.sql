DROP DATABASE IF EXISTS csd220_lab2_practice;
CREATE DATABASE csd220_lab2_practice CHARACTER SET utf8mb4;

USE csd220_lab2_practice;

DROP TABLE IF EXISTS building;
CREATE TABLE building (
	code CHAR(4) NOT NULL PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	sqft INT UNSIGNED,
	floors INT UNSIGNED,
	open_time TIME DEFAULT '6:00',
	lock_time TIME DEFAULT '22:00',
-- or:	CONSTRAINT pk_building PRIMARY KEY (code),
	UNIQUE idx_building_name (name)
);

DROP TABLE IF EXISTS room;
CREATE TABLE room (
	building_code CHAR(4) NOT NULL,
	room_number INT UNSIGNED,
	floor_number INT UNSIGNED,
	room_type ENUM('classroom', 'lecture hall', 'lab', 'office', 'bathroom', 'utility'),
	sqft INT UNSIGNED,
	has_windows BOOL DEFAULT 0,
	CONSTRAINT pk_room PRIMARY KEY (building_code, room_number),
	CONSTRAINT fk_room_building FOREIGN KEY (building_code) REFERENCES building(code) ON DELETE CASCADE,
	CHECK (room_number > 1000*floor_number AND room_number < 1000*floor_number + 1000)
);

INSERT INTO building VALUES
('AHC', 'Algoma Health Centre', 5000, 3, DEFAULT, DEFAULT),
('E', 'E-Wing', 3500, 4, DEFAULT, '1:00'),
('B', 'B-Wing', 2750, 1, DEFAULT, DEFAULT),
('M', 'M-Wing', 3200, 3, DEFAULT, DEFAULT)
;

-- AHC Rooms
INSERT INTO room VALUES
('AHC', 1001, 1, 'office', 100, 1),
('AHC', 1002, 1, 'office', 70, 0),
('AHC', 1003, 1, 'classroom', 600, 0),
('AHC', 1004, 1, 'classroom', 750, 0),
('AHC', 1005, 1, 'classroom', 500, 1),
('AHC', 1006, 1, 'bathroom', 80, 0),
('AHC', 1007, 1, 'utility', 80, 0),
('AHC', 2001, 2, 'office', 45, 1),
('AHC', 2002, 2, 'office', 30, 1),
('AHC', 2003, 2, 'classroom', 650, 1),
('AHC', 2004, 2, 'classroom', 780, 0),
('AHC', 2005, 2, 'classroom', 550, 0),
('AHC', 2006, 2, 'bathroom', 80, 0),
('AHC', 2007, 2, 'utility', 40, 1),
('AHC', 3001, 3, 'office', 100, 1),
('AHC', 3002, 3, 'office', 75, 1),
('AHC', 3003, 3, 'classroom', 650, 1),
('AHC', 3004, 3, 'classroom', 780, 0),
('AHC', 3005, 3, 'classroom', 550, 0),
('AHC', 3006, 3, 'bathroom', 80, 0),
('AHC', 3007, 3, 'utility', 25, 1);

-- B-Wing Rooms
INSERT INTO room VALUES
('B', 1011, 1, 'office', 100, 1),
('B', 1012, 1, 'utility', 70, 0),
('B', 1013, 1, 'classroom', 600, 0),
('B', 1014, 1, 'lab', 750, 0),
('B', 1015, 1, 'classroom', 500, 1),
('B', 1016, 1, 'office', 80, 0),
('B', 1017, 1, 'utility', 80, 0),
('B', 2011, 2, 'office', 45, 1),
('B', 2012, 2, 'office', 30, 1),
('B', 2013, 2, 'classroom', 650, 1),
('B', 2014, 2, 'lab', 780, 0),
('B', 2015, 2, 'classroom', 550, 0),
('B', 2016, 2, 'bathroom', 80, 0),
('B', 2017, 2, 'utility', 40, 1),
('B', 3011, 3, 'office', 100, 1),
('B', 3012, 3, 'office', 75, 1),
('B', 3013, 3, 'classroom', 650, 1),
('B', 3014, 3, 'classroom', 780, 0),
('B', 3015, 3, 'classroom', 550, 0),
('B', 3016, 3, 'bathroom', 80, 0),
('B', 3017, 3, 'utility', 25, 1);

-- E-Wing Rooms
INSERT INTO room VALUES
('E', 1011, 1, 'office', 100, 1),
('E', 1012, 1, 'utility', 70, 0),
('E', 1013, 1, 'classroom', 600, 0),
('E', 1014, 1, 'classroom', 750, 0),
('E', 1015, 1, 'classroom', 500, 1),
('E', 1016, 1, 'office', 80, 0),
('E', 1017, 1, 'utility', 80, 0),
('E', 2011, 2, 'office', 45, 1),
('E', 2012, 2, 'office', 30, 1),
('E', 2013, 2, 'lab', 650, 1),
('E', 2014, 2, 'lab', 780, 0),
('E', 2015, 2, 'lab', 550, 0),
('E', 2016, 2, 'bathroom', 80, 0),
('E', 2017, 2, 'utility', 40, 1),
('E', 3011, 3, 'office', 100, 1),
('E', 3012, 3, 'office', 75, 1),
('E', 3013, 3, 'classroom', 650, 1),
('E', 3014, 3, 'classroom', 780, 0),
('E', 3015, 3, 'classroom', 550, 0),
('E', 3016, 3, 'bathroom', 80, 0),
('E', 3017, 3, 'utility', 25, 1);

-- M-Wing Rooms
INSERT INTO room VALUES
('M', 1011, 1, 'office', 100, 1),
('M', 1012, 1, 'utility', 70, 0),
('M', 1013, 1, 'classroom', 600, 0),
('M', 1014, 1, 'classroom', 750, 0),
('M', 1015, 1, 'classroom', 500, 1),
('M', 1016, 1, 'office', 80, 0),
('M', 1017, 1, 'utility', 80, 0),
('M', 2011, 2, 'office', 45, 1),
('M', 2012, 2, 'office', 30, 1),
('M', 2013, 2, 'classroom', 650, 1),
('M', 2014, 2, 'classroom', 780, 0),
('M', 2015, 2, 'classroom', 550, 0),
('M', 2016, 2, 'bathroom', 80, 0),
('M', 2017, 2, 'utility', 40, 1),
('M', 3011, 3, 'office', 100, 1),
('M', 3012, 3, 'office', 75, 1),
('M', 3013, 3, 'lab', 650, 1),
('M', 3014, 3, 'classroom', 780, 0),
('M', 3015, 3, 'lab', 550, 0),
('M', 3016, 3, 'bathroom', 80, 0),
('M', 3017, 3, 'utility', 25, 1);


