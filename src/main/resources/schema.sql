--Employee
DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee(
    empId INT auto_increment primary key,
    name VARCHAR(25) NOT NULL,
    designation VARCHAR(10) NOT NULL,
    salary DOUBLE
);