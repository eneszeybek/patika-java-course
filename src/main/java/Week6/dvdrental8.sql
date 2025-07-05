CREATE TABLE employee (
    id INTEGER PRIMARY KEY,
    name VARCHAR(50),
    birthday DATE,
    email VARCHAR(100)
);
INSERT INTO employee (id, name, birthday, email) VALUES
(1, 'John Smith', '1985-06-12', 'john.smith@example.com'),
(2, 'Emily Davis', '1990-04-23', 'emily.davis@example.com'),
(3, 'Michael Johnson', '1978-11-07', 'michael.johnson@example.com'),
(4, 'Olivia Brown', '1982-01-30', 'olivia.brown@example.com'),
(5, 'William Miller', '1995-09-14', 'william.miller@example.com'),
(6, 'Emma Wilson', '1988-12-18', 'emma.wilson@example.com'),
(7, 'James Moore', '1980-08-03', 'james.moore@example.com'),
(8, 'Ava Taylor', '1993-07-25', 'ava.taylor@example.com'),
(9, 'Benjamin Anderson', '1986-10-06', 'benjamin.anderson@example.com'),
(10, 'Sophia Thomas', '1991-03-29', 'sophia.thomas@example.com'),
(11, 'Daniel Jackson', '1975-05-17', 'daniel.jackson@example.com'),
(12, 'Mia White', '1994-02-12', 'mia.white@example.com'),
(13, 'Matthew Harris', '1983-09-01', 'matthew.harris@example.com'),
(14, 'Isabella Martin', '1989-11-11', 'isabella.martin@example.com'),
(15, 'Joseph Thompson', '1979-04-08', 'joseph.thompson@example.com'),
(16, 'Charlotte Garcia', '1992-01-19', 'charlotte.garcia@example.com'),
(17, 'David Martinez', '1987-07-27', 'david.martinez@example.com'),
(18, 'Amelia Robinson', '1990-06-04', 'amelia.robinson@example.com'),
(19, 'Andrew Clark', '1981-03-22', 'andrew.clark@example.com'),
(20, 'Evelyn Rodriguez', '1984-10-30', 'evelyn.rodriguez@example.com'),
(21, 'Joshua Lewis', '1996-12-09', 'joshua.lewis@example.com'),
(22, 'Abigail Lee', '1985-08-20', 'abigail.lee@example.com'),
(23, 'Christopher Walker', '1977-02-17', 'christopher.walker@example.com'),
(24, 'Harper Hall', '1993-04-26', 'harper.hall@example.com'),
(25, 'Anthony Allen', '1982-05-15', 'anthony.allen@example.com'),
(26, 'Ella Young', '1991-09-03', 'ella.young@example.com'),
(27, 'Ryan Hernandez', '1980-11-28', 'ryan.hernandez@example.com'),
(28, 'Scarlett King', '1987-07-13', 'scarlett.king@example.com'),
(29, 'Thomas Wright', '1976-01-05', 'thomas.wright@example.com'),
(30, 'Grace Scott', '1994-06-21', 'grace.scott@example.com'),
(31, 'Nicholas Green', '1983-03-10', 'nicholas.green@example.com'),
(32, 'Lily Adams', '1988-09-08', 'lily.adams@example.com'),
(33, 'Jonathan Baker', '1978-12-02', 'jonathan.baker@example.com'),
(34, 'Aria Gonzalez', '1990-05-27', 'aria.gonzalez@example.com'),
(35, 'Brandon Nelson', '1986-02-16', 'brandon.nelson@example.com'),
(36, 'Victoria Carter', '1992-08-14', 'victoria.carter@example.com'),
(37, 'Justin Mitchell', '1984-07-01', 'justin.mitchell@example.com'),
(38, 'Penelope Perez', '1989-03-18', 'penelope.perez@example.com'),
(39, 'Kevin Roberts', '1981-11-06', 'kevin.roberts@example.com'),
(40, 'Layla Turner', '1995-04-04', 'layla.turner@example.com'),
(41, 'Brian Phillips', '1979-10-23', 'brian.phillips@example.com'),
(42, 'Nora Campbell', '1993-06-19', 'nora.campbell@example.com'),
(43, 'Eric Parker', '1982-12-31', 'eric.parker@example.com'),
(44, 'Zoe Evans', '1996-09-12', 'zoe.evans@example.com'),
(45, 'Jason Edwards', '1985-05-09', 'jason.edwards@example.com'),
(46, 'Hannah Collins', '1991-01-25', 'hannah.collins@example.com'),
(47, 'Kyle Stewart', '1987-08-22', 'kyle.stewart@example.com'),
(48, 'Lillian Sanchez', '1994-03-14', 'lillian.sanchez@example.com'),
(49, 'Aaron Morris', '1977-06-11', 'aaron.morris@example.com'),
(50, 'Stella Rogers', '1980-02-07', 'stella.rogers@example.com');
UPDATE employee
SET name = 'Ahmet Gün'
WHERE id = 10;
UPDATE employee
SET email = 'emma.wilson@update.com'
WHERE name = 'Emma Wilson';
UPDATE employee
SET name = 'Mehmet Can'
WHERE birthday = '1983-09-01';
UPDATE employee
SET birthday = '1990-01-01'
WHERE email = 'kyle.stewart@example.com';
UPDATE employee
SET email = 'anthony25.updated@mail.com'
WHERE id = 25;
DELETE FROM employee
WHERE id = 3;
DELETE FROM employee
WHERE name = 'Olivia Brown';
DELETE FROM employee
WHERE birthday = '1994-06-21';
DELETE FROM employee
WHERE email = 'lily.adams@example.com';
DELETE FROM employee
WHERE id > 45
LIMIT 1;
