-- Task 1
-- Q1
SELECT employees.email, offices.city
FROM employees
INNER JOIN offices on employees.officeCode=offices.officeCode;

-- Q2 
SELECT customers.customerName
FROM customers
INNER JOIN employees on customers.salesRepEmployeeNumber=employees.employeeNumber;

-- Q3
SELECT productName FROM products left JOIN orderdetails on products.productCode=orderdetails.productCode;

-- Q4
SELECT customerName, phone FROM customers inner join orders on customers.customerNumber=orders.customerNumber where status = 'Cancelled';

-- Q5
SELECT customerNumber, amount FROM payments inner join customers on payments.customerNumber=customers.customerNumber where amount = '0';


-- Q6



-- Task 2
-- Q1
select firstName, lastName, customerName, sum(quantityOrdered * priceEach) as total
from employees e
	join customers c on c.salesRepEmployeeNumber = e.employeeNumber
	join orders using (customerNumber)
	join orderdetails using (orderNumber)
group by employeeNumber  
order by total desc;

-- Q2
select customerName, phone, 
from employees e 
	join customers c on c.salesRepEmployeeNumber = e.employeeNumber
	join orders using (customerNumber)
	join orderdetails using (orderNumber)
where employeeNumber in ('1165')
group by employeeNumber;


-- Q3