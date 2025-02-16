
CREATE DATABASE college

CREATE DATABASE IF NOT EXISTS college2

DROP DATABASE IF EXISTS 

SHOW DATABASES

use college

create Table student(id int PRIMARY KEY,
name VARCHAR(50),
age int NOT NULL
)

show TABLES

insert INTO student VALUES(1,"saksham",22)

insert INTO student VALUES(2,"brahmanji",21)

INSERT INTO student (age,name,id) VALUES
(29,"aujla", 3),
(45, "encore",4);

SELECT * FROM student

CREATE Table
    temp2 (id INT UNIQUE,
    name VARCHAR(20),
    u_age INT NOT NULL,
    city VARCHAR(20),
    PRIMARY KEY (id)
    )

INSERT INTO temp1 VALUES(101)

DROP Table temp2

SELECT * FROM temp2

CREATE Table emp(
    id INT,
    salary int DEFAULT 25000
)

insert INTO emp (id,salary) VALUES(
    1,10000
)

SELECT * FROM emp

drop Table emp

drop TABLE student

CREATE Table student(
    rollno INT PRIMARY KEY,
    name VARCHAR(10),
    marks INT NOT NULL,
    grade VARCHAR(1),
    city VARCHAR(20)
)

insert INTO student VALUES(
    7,"taimur",10,"E","UK"
),(
    6,"talha",78,"B","MP"
),(
    4,"calm",80,"B","UP"
),(
    105,"King",50,"D","Jaipur"
),(
    101,"saksham",90,"A","Jaipur"
),(
    102,"panther",30,"C","Bihar"
),(
    103,"fourty",94,"A","bihar"
)

DROP Table student

SELECT DISTINCT city from student

SELECT * FROM student WHERE marks > 20

SELECT * from student WHERE city = "ludhiana"

SELECT * FROM student WHERE marks < 40 AND city = "up"

SELECT * from student WHERE marks+10 > 100

SELECT * FROM student WHERE marks >= 20

SELECT * FROM student WHERE marks > 100 OR city = "up"

SELECT * FROM student WHERE marks BETWEEN 30 AND 100

SELECT * FROM student WHERE city IN ("ludhiana","UP","bihar")

SELECT * FROM student WHERE city NOT IN ("ludhiana","up")

-- limit clause

SELECT * FROM student WHERE marks > 30 LIMIT 3

--  order by
SELECT * FROM student ORDER BY city DESC

SELECT * FROM student ORDER BY marks DESC LIMIT 3

SELECT AVG(marks) FROM student

SELECT min(marks) FROM student

SELECT COUNT(name) FROM student

-- Group By Clause
SELECT city FROM student GROUP BY city

-- it creates the group of students based on a specific condition like if i want to check how many students are there from every city it will return the count of students from the every city
SELECT city, COUNT(name) FROM student GROUP BY city

-- city mai kitne same name wale hai woh return karta hai yeh wala code
SELECT city,name, COUNT(name) FROM student GROUP BY city,name

SELECT city, avg(marks) FROM student GROUP BY city

SELECT city, AVG(marks) FROM student GROUP BY city ORDER BY AVG(marks) DESC

--  PRACTICE QUESTIOM

CREATE Table payment(
    customer_id int PRIMARY KEY,
    customer_name VARCHAR(10),
    mode VARCHAR(20),
    city VARCHAR(20)
)

INSERT INTO payment VALUES(
    1,"saksham","creditcard","ludhiana"
),(
    2,"encore","netbankins","up"
),(
    3,"calm","debitcard","mp"
),(
    4,"talha","creditcard","chandigarh"
),(
    5,"neazy","netbankins","up"
),(
    6,"yunsum","debitcard","chandigarh"
),(
    7,"sherjina","debitcard","ludhiana"
),(
    8,"muftza","netbankins","mp"
)

SELECT mode, COUNT(customer_id) FROM payment GROUP BY mode

SELECT grade,COUNT(rollno) FROM student GROUP BY grade ORDER BY grade DESC

-- Having clause
-- it is similar to where but in where it apply conditions on rows but having will apply conditions on groups
-- example - count number of students in each city where max makrs cross 90

SELECT city ,COUNT(rollno) FROM student GROUP BY city HAVING MAX(marks) > 50

-- General Order to apply all clauses

-- select col
-- from tb
-- where cond
-- group by col
-- having cond
-- order by col asc

SELECT city from student WHERE grade = "B" GROUP BY city HAVING MAX(marks) > 40 ORDER BY  city DESC

-- update
UPDATE student set grade = "O" WHERE grade = "A"

UPDATE student SET name = "sos" WHERE rollno = 3

UPDATE student SET grade="C" WHERE marks BETWEEN 30 AND 50

UPDATE student SET marks = marks+1

--  delete
DELETE FROM student WHERE marks < 12

SELECT * FROM student

-- Foregin Key !!

CREATE Table department(
    d_id int PRIMARY KEY,
    d_name VARCHAR(10) NOT NULL
)

insert INTO department VALUES(
    101,"science"
),(
    102,"english"
),(
    103,"hindi"
)

SELECT * FROM department

CREATE Table teacher(
    t_id INT PRIMARY KEY,
    t_name VARCHAR(20),
    t_dep_id INT,
    FOREIGN KEY(t_dep_id) REFERENCES department(d_id)
    on update CASCADE
    on delete CASCADE
)

INSERT INTO teacher VALUES(
    1,"saksham",101
),(
    2,"encore",102
),(
    3,"calm",103
),(
    4,"king",102
),(
    5,"talha",101
)

UPDATE department set d_id = 100 WHERE d_id = 101

SELECT * FROM teacher

-- Alter

ALTER Table student ADD COLUMN age int NOT NULL DEFAULT 20

ALTER Table student DROP COLUMN age

ALTER Table students RENAME student

ALTER Table student CHANGE COLUMN s_age s_age VARCHAR(10) NOT NULL

ALTER Table student MODIFY s_age INT NOT NULL

TRUNCATE Table teacher

SELECT * FROM student

-- Practice Ques

ALTER Table student CHANGE COLUMN name full_name VARCHAR(10) NOT NULL

DELETE FROM student WHERE marks < 30

ALTER Table student DROP COLUMN age

SELECT * FROM student

-- Joins


CREATE Table course(
    c_id int PRIMARY KEY,
    c_name VARCHAR(10)
)

INSERT INTO course VALUES(
    101, "english"
),(
    102,"hindi"
),(
    103,"science"
)

SELECT * FROM student

SELECT * FROM course
-- Inner Join

-- alices are short form of a coloum we define. so that we dont need to write whole col name again
SELECT * FROM student as s INNER JOIN course as c
ON s.rollno = c.c_id

-- left join

SELECT * FROM student LEFT JOIN course on student.rollno = course.c_id

-- full join

SELECT * 
FROM student 
LEFT JOIN course 
on student.rollno = course.c_id
UNION
SELECT * 
FROM student 
RIGHT JOIN course 
on student.rollno = course.c_id

-- left exclusive join

SELECT * 
FROM student as a
LEFT JOIN course as b
on a.rollno = b.c_id
WHERE b.c_id IS NULL

-- right exclusive join

SELECT * 
FROM student as a
RIGHT JOIN course as b
on a.rollno = b.c_id
WHERE a.rollno IS NULL

-- self join

CREATE Table emp(
    id int PRIMARY KEY,
    name VARCHAR(10),
    manager_id int
)

insert INTO emp VALUES(
    101,"saksham",103
),(
    102,"encore",104
),(
    103,"king",NULL
),(
    104,"calm",103
)

SELECT a.name as manager_name, b.name 
FROM emp as a
JOIN emp as b
ON a.id = b.manager_id

-- Union

SELECT name FROM emp
UNION ALL -- it allows the repated values
SELECT name from emp

-- SQL Sub Queries

SELECT AVG(marks) FROM student

SELECT name,marks FROM student 
WHERE marks > 61.714

SELECT name,marks FROM student 
WHERE marks > (SELECT AVG(marks) FROM student)

-- another example
-- find all even roll
-- find names of student with even roll

SELECT NAME,rollno FROM student
WHERE rollno IN (SELECT rollno WHERE rollno % 2 = 0)

-- Sub Query in FROM

SELECT MAX(marks) FROM (SELECT * FROM student WHERE city = "bihar") as temp

-- Sub Query in Select we never use this type and FROM one also

SELECT (SELECT max(marks) FROM student), name FROM student

-- View in SQL

CREATE VIEW view1 as
SELECT rollno, name FROM student

SELECT * FROM view1

DROP View view1