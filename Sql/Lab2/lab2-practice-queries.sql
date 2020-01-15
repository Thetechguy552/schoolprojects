CREATE TABLE room_as AS SELECT * FROM room;
SELECT * FROM room_as;
SHOW CREATE TABLE room_as;

CREATE TABLE room_like LIKE room;
SELECT * FROM room_like;
INSERT INTO room_like SELECT * FROM room;
SHOW CREATE TABLE room_like;

TRUNCATE building;
DELETE FROM building;
SELECT * FROM building;
SELECT * FROM room;


-- Part 3 solutions
select distinct room_type from room;


select * from building where lock_time BETWEEN '0:00' AND '2:00';

select * from room where room_type = 'office' and has_windows;

select * from room where room_type = 'lab' order by sqft ASC;

select * from room where room_type ='office' and has_windows order by sqft DESC limit 1 offset 2;

select avg(sqft) from room where building_code = 'B';

select concat(building_code, '-', room_number) from room order by room_code;
