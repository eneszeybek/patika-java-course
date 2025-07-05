SELECT DISTINCT first_name FROM actor
UNION
SELECT DISTINCT first_name FROM customer;
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer;
SELECT DISTINCT first_name FROM actor
INTERSECT
SELECT DISTINCT first_name FROM customer;
SELECT first_name FROM actor
INTERSECT ALL
SELECT first_name FROM customer;
SELECT DISTINCT first_name FROM actor
EXCEPT
SELECT DISTINCT first_name FROM customer;
SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer;
