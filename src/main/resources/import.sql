 

DELETE FROM EMPLOYEE;
DELETE FROM DEPARTMENT;


INSERT INTO DEPARTMENT(id,dept_name) VALUES(100,'MECHANICAL');
INSERT INTO DEPARTMENT(id,dept_name) VALUES(101,'CIVIL');
INSERT INTO DEPARTMENT(id,dept_name) VALUES(102,'EEE');


INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(100,'Saran','Paddy','M','1990-12-07','2011-04-01',100);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(200,'Chris','Pierce','M','1989-07-11','2012-08-21',100);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(300,'Hayley','Drake','M','1992-10-01','2007-07-06',101);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(400,'Nancie','Beasley','M','1978-02-21','2003-03-03',101);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(500,'Wyatt','Holder','M','1994-12-01','2016-02-15',101);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(600,'Tobey','Drake','M','1992-10-01','2014-06-11',102);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(700,'Marvin','Hope','F','1978-02-21','2003-09-10',102);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(800,'Ibrar','Garcia','F','1994-12-01','2004-12-21',102);

