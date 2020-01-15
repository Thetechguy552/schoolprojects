-- Task 1 solutions
-- Q1
SELECT count(orderNumber), status
FROM orders
GROUP BY status;

-- Q2

select productLine 
from 
(SELECT productLine FROM products WHERE quantityInStock < '500') as productLines
group by productLine
having count(*) > 1;

-- Q3
SELECT customerName, phone FROM customers
WHERE customerNumber IN (SELECT customerNumber FROM orders where status = 'Cancelled');

-- Q4
SELECT customerName, phone FROM customers
where exists (SELECT customerNumber FROM orders where status = 'Disputed');

-- Q5

select customerNumber, SUM(amount) from payments
group by customerNumber;

-- Task 2 solutions
-- Q1
SELECT customerNumber, count(status) as Shipped FROM orders where status = 'Shipped'
group by customerNumber
order by shipped desc;

-- Q2
SELECT customerNumber, count(status) as Shipped FROM orders where status = 'Shipped'
group by customerNumber
HAVING COUNT(status) > '5'
order by shipped desc;

-- Q3
SELECT orderDate, customerNumber, count(status) as Shipped FROM orders where status = 'Shipped'
group by customerNumber
HAVING COUNT(status) > '5' or orderDate = '2004'
order by shipped desc;

-- Q4
select * from customers
(SELECT orderDate, customerNumber, count(status) as Shipped FROM orders where status = 'Shipped')
group by customerNumber
HAVING COUNT(status) > '5' or orderDate = '2004'
order by shipped desc

-- Q5


-- Q6

