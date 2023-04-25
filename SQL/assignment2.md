

#Assignment 2 

```SQL

create table mydept_DBDA
(
deptid int primary key,
dname varchar(20) not null unique,
dloc varchar(20)
)


insert into mydept_DBDA values(30,'Purchase','Mumbai');




```


```SQL

create table myemployee
(
empno int primary key,
fname varchar(15) not null,
mname varchar(15),
lname varchar(15) not null,
sal float(9,2) check(sal >=1000),
doj date,
passportnum varchar(15) unique,
deptno int,
constraint fk_deptno foreign key(deptno) references mydept_DBDA(deptid) on
delete set null
on update cascade
)

```


```SQL
create table myemployee
(
empno int primary key,
ename varchar(15) not null,
mname varchar(15),
lname varchar(15) not null,
sal float(9,2) check(sal >=1000),
doj date,
passportnum varchar(15) unique,
deptno int,
constraint fk_deptno foreign key(deptno) references mydept_DBDA(deptid) on
delete set null
on update cascade
)

```


```sql

CREATE TABLE STUDENT (
    Sid int primary key,
    sname varchar(20)
)


insert into student values(1,"Rahul");
insert into student values(2,"Tushar");
insert into student values(3,"Ramu");


CREATE TABLE course (
    cid int primary key,
    cname varchar(20)
)

insert into course values(1,"JAVA");
insert into course values(2,"DATABASE");
insert into course values(3,"C++");

create table marks(
sid int,
cid int,
marks int,
constraint pk primary key(sid,cid),
constraint fk_sid foreign key (sid) references student(sid) on delete cascade,
constraint fk_cid foreign key (cid) references course(cid)
)


insert into marks values(1,1,99);
insert into marks values(1,3,98);
insert into marks values(2,1,95);
insert into marks values(2,2,97);

```


```sql
CREATE TABLE EMP
       (EMPNO INT(4) NOT NULL,
        ENAME varchar(10),
        JOB varchar(9),
        MGR INT(4),
        HIREDATE DATE,
        SAL DECIMAL(7, 2),
        COMM DECIMAL(7, 2),
        DEPTNO INT(2));

INSERT INTO EMP VALUES
        (101, 'RAHUL',  'CLERK',     106,
        STR_TO_DATE('12-JAN-2000', '%d-%b-%Y'),  1500, NULL, 20);
INSERT INTO EMP VALUES
        (7499, 'ALLEN',  'SALESMAN',  7698,
        STR_TO_DATE('20-FEB-1981', '%d-%b-%Y'), 1600,  300, 30);
INSERT INTO EMP VALUES
        (7521, 'WARD',   'SALESMAN',  7698,
        STR_TO_DATE('22-FEB-1981', '%d-%b-%Y'), 1250,  500, 30);
INSERT INTO EMP VALUES
        (7566, 'JONES',  'MANAGER',   7839,
        STR_TO_DATE('2-APR-1981', '%d-%b-%Y'),  2975, NULL, 20);
INSERT INTO EMP VALUES
        (7654, 'MARTIN', 'SALESMAN',  7698,
        STR_TO_DATE('28-SEP-1981', '%d-%b-%Y'), 1250, 1400, 30);
INSERT INTO EMP VALUES
        (7698, 'BLAKE',  'MANAGER',   7839,
        STR_TO_DATE('1-MAY-1981', '%d-%b-%Y'),  2850, NULL, 30);
INSERT INTO EMP VALUES
        (7782, 'CLARK',  'MANAGER',   7839,
        STR_TO_DATE('9-JUN-1981', '%d-%b-%Y'),  2450, NULL, 10);
INSERT INTO EMP VALUES
        (7788, 'SCOTT',  'ANALYST',   7566,
        STR_TO_DATE('09-DEC-1982', '%d-%b-%Y'), 3000, NULL, 20);
INSERT INTO EMP VALUES
        (7839, 'KING',   'PRESIDENT', NULL,
        STR_TO_DATE('17-NOV-1981', '%d-%b-%Y'), 5000, NULL, 10);
INSERT INTO EMP VALUES
        (7844, 'TURNER', 'SALESMAN',  7698,
        STR_TO_DATE('8-SEP-1981', '%d-%b-%Y'),  1500,    0, 30);

```


```SQL


create table emp10 as
(
select *
from emp
where 1=2
)


mysql> DESC EMP10;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| EMPNO    | int          | NO   |     | NULL    |       |
| ENAME    | varchar(10)  | YES  |     | NULL    |       |
| JOB      | varchar(9)   | YES  |     | NULL    |       |
| MGR      | int          | YES  |     | NULL    |       |
| HIREDATE | date         | YES  |     | NULL    |       |
| SAL      | decimal(7,2) | YES  |     | NULL    |       |
| COMM     | decimal(7,2) | YES  |     | NULL    |       |
| DEPTNO   | int          | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+
8 rows in set (0.00 sec)



ALTER TABLE EMP10
add primary key (EMPNO)
--------------------------------------------------------
mysql> desc emp10;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| EMPNO    | int          | NO   | PRI | NULL    |       |
| ENAME    | varchar(10)  | YES  |     | NULL    |       |
| JOB      | varchar(9)   | YES  |     | NULL    |       |
| MGR      | int          | YES  |     | NULL    |       |
| HIREDATE | date         | YES  |     | NULL    |       |
| SAL      | decimal(7,2) | YES  |     | NULL    |       |
| COMM     | decimal(7,2) | YES  |     | NULL    |       |
| DEPTNO   | int          | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+
8 rows in set (0.00 sec)

###########
ALTER TABLE dept
add primary key (deptno);

mysql> desc dept;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| DEPTNO | int         | NO   | PRI | NULL    |       |
| DNAME  | varchar(14) | YES  |     | NULL    |       |
| LOC    | varchar(13) | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)



ALTER TABLE  salgrade
add primary key (grade);
mysql> desc salgrade;
+-------+------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra |
+-------+------+------+-----+---------+-------+
| GRADE | int  | NO   | PRI | NULL    |       |
| LOSAL | int  | YES  |     | NULL    |       |
| HISAL | int  | YES  |     | NULL    |       |
+-------+------+------+-----+---------+-------+
3 rows in set (0.00 sec)






```


##35. Update employee sal ---- increase sal of each employee by 15 % sal +comm, change the job to
manager and mgr to 7777 for all employees in deptno 10.

```SQL

UPDATE EMP
SET SAL=SAL+COMM+(SAL*1.15)
WHERE DEPTNO=10 AND DEPTNO IS NOT NULL;


UPDATE EMP
SET jOB='MANAGER'
WHERE DEPTNO=10 AND DEPTNO IS NOT NULL;


UPDATE EMP
SET MGR =7777
WHERE DEPTNO=10 AND DEPTNO IS NOT NULL;



```

#41  delete all employees working in alan's department

```SQL
0.
DELETE from emp where deptno=(select deptno where ename='allen');

mysql> DELETE from emp where deptno=(select deptno where ename='allen');
Query OK, 1 row affected (0.00 sec)

mysql> select * from emp;
+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+

```



#38. list all employees with sal>smith's sal


```sql


mysql> SELECT * FROM EMP
    -> WHERE SAL>(SELECT SAL FROM EMP WHERE ENAME='SMITH');
+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+
12 rows in set (0.00 sec)

```


#39. list all employees who are working in smith's department
#You can't specify target table 'EMP' for update in FROM clause
```SQL



mysql> DELETE FROM EMP
    -> WHERE DEPTNO = (SELECT e.DEPTNO FROM (select * from emp) e WHERE e.ename='ALLEN' );
Query OK, 6 rows affected (0.00 sec)

mysql> SELECT * FROM EMP;
+-------+--------+-----------+------+------------+---------+------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+--------+-----------+------+------------+---------+------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 | NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 | NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 | NULL |     10 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 | NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 | NULL |     10 |
+-------+--------+-----------+------+------------+---------+------+--------+
8 rows in set (0.00 sec)


```


-----------------------------------------------------------

Q 40 to 52 in loptop

-----------------------------------------------------



```sql

52. display empno,name,department name and grade (use emp,dept and salgrade table)

SELECT E.EMPNO,E.ENAME,E.DEPTNO,S.GRADE
FROM EMP E INNER JOIN DEPT D 
WHERE E.DEPTNO=D.DEPTNO RIGHT OUTER JOIN SALGRADE S WHERE S.HISAL IN E.MAX(SAL);

SELECT EMPNO ,ENAME, E.DEPTNO,S.GRADE
FROM EMP E, DEPT,SALGRADE S
WHERE HISAL IN E.MAX(SAL);

SELECT ENAME
 FROM EMP
 WHERE SAL IN (SELECT MAX(SAL) FROM SALGRADE );



```



```SQL

53. list all employees number,name, mgrno and manager name


mysql> SELECT E.EMPNO,E.ENAME,E.MGR,E.ENAME
    -> FROM EMP E
    -> WHERE DEPTNO IN (SELECT DEPTNO FROM EMP A WHERE A.EMPNO=E.MGR);
+-------+--------+------+--------+
| EMPNO | ENAME  | MGR  | ENAME  |
+-------+--------+------+--------+
|  7369 | SMITH  | 7902 | SMITH  |
|  7499 | ALLEN  | 7698 | ALLEN  |
|  7521 | WARD   | 7698 | WARD   |
|  7654 | MARTIN | 7698 | MARTIN |
|  7782 | CLARK  | 7839 | CLARK  |
|  7788 | SCOTT  | 7566 | SCOTT  |
|  7844 | TURNER | 7698 | TURNER |
|  7876 | ADAMS  | 7788 | ADAMS  |
|  7900 | JAMES  | 7698 | JAMES  |
|  7902 | FORD   | 7566 | FORD   |
|  7934 | MILLER | 7782 | MILLER |
+-------+--------+------+--------+
11 rows in set (0.00 sec)




```



```sql

Create table category(
    cid int primary key ,
     cname varchar(20) not null,
    cdesc varchar(20));


insert into category values(1,'chips','very crispy');
insert into category values(2,'cold drink ','cool cool');
insert into category values(3,'snacks ','Spicy');

mysql> select * from category;
+-----+-------------+-------------+
| cid | cname       | cdesc       |
+-----+-------------+-------------+
|   1 | chips       | very crispy |
|   2 | cold drink  | cool cool   |
|   3 | snacks      | Spicy       |
+-----+-------------+-------------+
3 rows in set (0.00 sec)





 Create table product(
     pid int primary key,
     pname varchar(20) not null unique,
     qty int check(qty >0) default 10,
     price double(9,2) check(price>0),
     catid int,
     foreign key fk_cid(catid) references category(cid)
     );

insert into product values(10,'lays',23,40.00,1);
insert into product values(11,'',23,40.00,1);
insert into product values(12,'nachos',23,140.00,1);
insert into product(pid,pname,qty,price,catid) values(13,'coca cola',10,150.00,2);

mysql> select * from product;
+-----+-----------+------+--------+-------+
| pid | pname     | qty  | price  | catid |
+-----+-----------+------+--------+-------+
|  10 | lays      |   23 |  40.00 |     1 |
|  11 | kurkure   |   23 |  40.00 |     1 |
|  12 | nachos    |   23 | 140.00 |     1 |
|  13 | coca cola |   10 | 150.00 |     2 |
+-----+-----------+------+--------+-------+
4 rows in set (0.00 sec)

Create table salesman(
     sid int primary key,
     sname varchar(20) not null unique,
     saddress varchar(20) not null unique,
   
     catid int,
     foreign key fk_cid(catid) references category(cid)
     );

insert into salesman values(100,'vijay','pune',1);
insert into salesman values(200,'ritesh','mumbai',2);
insert into salesman values(300,'laxmi','solapur',3);

mysql> select * from salesman;
+-----+--------+----------+-------+
| sid | sname  | | catid |
+-----+--------+----------+-------+
| 100 | vijay  | pune     |     1 |
| 200 | ritesh | mumbai   |     2 |
| 300 | laxmi  | solapur  |     3 |
+-----+--------+----------+-------+
3 rows in set (0.00 sec)

SELECT P.PNAME,C.CNAME,S.SNAME
FROM PRODUCT P, CATEGORY C , SALESMAN S
WHERE P.CATID=C.CID AND S.CATID = C.CID;




## 1. list all product name,their category name and name of a person, who sold that product


mysql> SELECT P.PNAME,C.CNAME,S.SNAME
    -> FROM PRODUCT P, CATEGORY C , SALESMAN S
    -> WHERE P.CATID=C.CID AND S.CATID = C.CID;
+-----------+-------------+--------+
| PNAME     | CNAME       | SNAME  |
+-----------+-------------+--------+
| lays      | chips       | vijay  |
| kurkure   | chips       | vijay  |
| nachos    | chips       | vijay  |
| coca cola | cold drink  | ritesh |
+-----------+-------------+--------+
4 rows in set (0.00 sec)


## 2. list all product name and salesman name for all salesman who stays in pune

SELECT P.PNAME,S.SNAME
FROM PRODUCT P , SALESMAN S
WHERE P.CATID IN (SELECT CATID FROM SALESMAN WHERE saddress = 'PUNE')


mysql> SELECT P.PNAME,S.SNAME,S.saddress
     FROM PRODUCT P , SALESMAN S
     WHERE P.CATID EXIST (SELECT CATID FROM SALESMAN WHERE saddress = 'PUNE');



     SELECT P.PNAME,S.SNAME,S.saddress
     FROM PRODUCT P , SALESMAN S 
     WHERE P.CATID=S.CATID AND S.saddress = 'PUNE';




mysql>      SELECT P.PNAME,S.SNAME,S.saddress
    ->      FROM PRODUCT P , SALESMAN S
    ->      WHERE P.CATID=S.CATID AND S.saddress = 'PUNE';
+---------+-------+----------+
| PNAME   | SNAME | saddress |
+---------+-------+----------+
| lays    | vijay | pune     |
| kurkure | vijay | pune     |
| nachos  | vijay | pune     |
+---------+-------+----------+
3 rows in set (0.00 sec)



3. list all product name and category name


SELECT * 
FROM PRODUCT P , CATEGORY C
WHERE P.CATID=C.CID;

mysql> SELECT *
    -> FROM PRODUCT P , CATEGORY C
    -> WHERE P.CATID=C.CID;
+-----+-----------+------+--------+-------+-----+-------------+-------------+
| pid | pname     | qty  | price  | catid | cid | cname       | cdesc       |
+-----+-----------+------+--------+-------+-----+-------------+-------------+
|  10 | lays      |   23 |  40.00 |     1 |   1 | chips       | very crispy |
|  11 | kurkure   |   23 |  40.00 |     1 |   1 | chips       | very crispy |
|  12 | nachos    |   23 | 140.00 |     1 |   1 | chips       | very crispy |
|  13 | coca cola |   10 | 150.00 |     2 |   2 | cold drink  | cool cool   |
+-----+-----------+------+--------+-------+-----+-------------+-------------+
4 rows in set (0.00 sec)

```


```SQL



1. List all products with category chips

mysql> SELECT * FROM PRODUCT P , CATEGORY C
    -> WHERE P.CATID=C.CID AND CNAME='chips';
+-----+---------+------+--------+-------+-----+-------+-------------+
| pid | pname   | qty  | price  | catid | cid | cname | cdesc       |
+-----+---------+------+--------+-------+-----+-------+-------------+
|  10 | lays    |   23 |  40.00 |     1 |   1 | chips | very crispy |
|  11 | kurkure |   23 |  40.00 |     1 |   1 | chips | very crispy |
|  12 | nachos  |   23 | 140.00 |     1 |   1 | chips | very crispy |
+-----+---------+------+--------+-------+-----+-------+-------------+
3 rows in set (0.00 sec)




2. display all products sold by kirti

3. display all salesman who do not sold any product
4. display all category for which no product is there

SELECT C.CNAME FROM CATEGORY C
WHERE C.CID EXIST (SELECT P.CATID FROM PRODUCT P WHERE P.CATID=C.CID)


6. list all salesman who stays in city with name starts with P 
        

SELECT P.PNAME,S.SNAME,S.saddress
     FROM PRODUCT P , SALESMAN S
    WHERE P.CATID=S.CATID AND S.saddress LIKE 'P%';
+---------+-------+----------+
| PNAME   | SNAME | saddress |
+---------+-------+----------+
| lays    | vijay | pune     |
| kurkure | vijay | pune     |
| nachos  | vijay | pune     |
+---------+-------+----------+
3 rows in set (0.01 sec)


```