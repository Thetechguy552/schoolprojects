-- Lab 7
-- Task 1
-- Q1
drop function if exists is_prime~
create function is_prime(num VARCHAR(50))  returns boolean
begin
	IF num = '42' THEN RETURN TRUE;
	ELSE RETURN FALSE;
end~

select is_prime(1);


-- Q2
