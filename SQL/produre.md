#Assignment on Produres 




1. write a procedure to insert record into employee table.
the procedure should accept empno, ename, sal, job, hiredate as input parameter
write insert statement inside procedure insert_rec to add one record into table


```sql

delimiter //
create procedure insert_rec(peno int,pnm varchar(20),psal decimal(9,2),pjob
varchar(20),phiredate date)
begin
insert into emp(empno,ename,sal,job,hiredate)
values(peno,pnm,psal,pjob,phiredate);
end//

delimiter 

1) call insert_rec(101,'RAHUL',2500,'SALESMAN','1999-10-12');



mysql> call insert_rec(101,'RAHUL',2500,'SALESMAN','1999-10-12');
Query OK, 1 row affected (0.04 sec)

mysql> SELECT * FROM EMP;
+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
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
|   101 | RAHUL  | SALESMAN  | NULL | 1999-10-12 | 2500.00 |    NULL |   NULL |
+-------+--------+-----------+------+------------+---------+---------+--------+
15 rows in set (0.00 sec)


2) call insert_rec(103,'DINESH',3000,'MANAGER','2000-09-11');


mysql> call insert_rec(103,'DINESH',3000,'MANAGER','2000-09-11');
Query OK, 1 row affected (0.03 sec)

mysql> SELECT * FROM EMP;
+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
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
|   101 | RAHUL  | SALESMAN  | NULL | 1999-10-12 | 2500.00 |    NULL |   NULL |
|   103 | DINESH | MANAGER   | NULL | 2000-09-11 | 3000.00 |    NULL |   NULL |
+-------+--------+-----------+------+------------+---------+---------+--------+
16 rows in set (0.00 sec)

```


2) 2. write a procedure to delete record from employee table.
the procedure should accept empno as input parameter.
write delete statement inside procedure delete_emp to delete one record from emp
table


```SQL


delimiter //
create procedure delete_rec(peno int)
begin

delete
from emp where empno=peno;

end//

delimiter 

call delete_rec(103)


mysql> delimiter //
mysql> create procedure delete_rec(peno int)
    -> begin
    ->
    -> delete
    -> from emp where empno=peno;
    ->
    -> end//
Query OK, 0 rows affected (0.02 sec)

mysql>
mysql> delimiter ;
mysql> select * from emp;
+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
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
|   101 | RAHUL  | SALESMAN  | NULL | 1999-10-12 | 2500.00 |    NULL |   NULL |
|   103 | DINESH | MANAGER   | NULL | 2000-09-11 | 3000.00 |    NULL |   NULL |
+-------+--------+-----------+------+------------+---------+---------+--------+
16 rows in set (0.00 sec)

mysql> call delete_rec(103);
Query OK, 1 row affected (0.04 sec)

mysql> SELECT * FROM EMP;
+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
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
|   101 | RAHUL  | SALESMAN  | NULL | 1999-10-12 | 2500.00 |    NULL |   NULL |
+-------+--------+-----------+------+------------+---------+---------+--------+
15 rows in set (0.00 sec)


drop procedure  delete_rec



```SQL



## 3) write a procedure to display empno,ename,deptno,dname for all employees with sal
> given salary. pass salary as a parameter to procedure


```SQL

delimiter //
create procedure greatersal(psal double(9,2))
begin

select empno,ename,e.deptno,dname,sal
from emp e ,dept d
where e.deptno=d.deptno and e.sal>psal;

end//

delimiter ;



ANS ----


mysql> delimiter //
mysql> create procedure greatersal(psal double(9,2))
    -> begin
    ->
    -> select empno,ename,e.deptno,dname,sal
    -> from emp e ,dept d
    -> where e.deptno=d.deptno and e.sal>psal;
    ->
    -> end//
Query OK, 0 rows affected, 1 warning (0.02 sec)

mysql>
mysql> delimiter ;
mysql> call greatersal(1500);
+-------+-------+--------+------------+---------+
| empno | ename | deptno | dname      | sal     |
+-------+-------+--------+------------+---------+
|  7499 | ALLEN |     30 | SALES      | 1600.00 |
|  7566 | JONES |     20 | RESEARCH   | 2975.00 |
|  7698 | BLAKE |     30 | SALES      | 2850.00 |
|  7782 | CLARK |     10 | ACCOUNTING | 2450.00 |
|  7788 | SCOTT |     20 | RESEARCH   | 3000.00 |
|  7839 | KING  |     10 | ACCOUNTING | 5000.00 |
|  7902 | FORD  |     20 | RESEARCH   | 3000.00 |
+-------+-------+--------+------------+---------+
7 rows in set (0.00 sec)

Query OK, 0 rows affected (0.01 sec)

```


## 4) 4. write a procedure to find min,max,avg of salary and number of employees in the
given deptno.
deptno --→ in parameter
min,max,avg and count ---→ out type parameter
execute procedure and then display values min,max,avg and count;

```sql

delimiter //
create procedure empsal(in num int)
begin

    select max(sal),min(sal),avg(sal),count(*)
    from emp
    where deptno=num;

end//

delimiter ;


## ANS

mysql> call empsal(10);
+----------+----------+-------------+----------+
| max(sal) | min(sal) | avg(sal)    | count(*) |
+----------+----------+-------------+----------+
|  5000.00 |  1300.00 | 2916.666667 |        3 |
+----------+----------+-------------+----------+
1 row in set (0.01 sec)

Query OK, 0 rows affected (0.02 sec)




mysql> call empsal(20);
+----------+----------+-------------+----------+
| max(sal) | min(sal) | avg(sal)    | count(*) |
+----------+----------+-------------+----------+
|  3000.00 |   800.00 | 2175.000000 |        5 |
+----------+----------+-------------+----------+
1 row in set (0.00 sec)

Query OK, 0 rows affected (0.00 sec)

mysql> call empsal(30);
+----------+----------+-------------+----------+
| max(sal) | min(sal) | avg(sal)    | count(*) |
+----------+----------+-------------+----------+
|  2850.00 |   950.00 | 1566.666667 |        6 |
+----------+----------+-------------+----------+
1 row in set (0.00 sec)

Query OK, 0 rows affected (0.00 sec)

```





```sql

------------Caterory table----------------
Create table category(
cid int primary key ,
cname varchar(20) not null,
cdesc varchar(20) 
);


insert into category values(1,'chips','very crispy');

insert into category values(2,'cold drink','cool cool');

insert into category(cid,cname) values(3,'snacks');



--------------Product table--------------


Create table product(
pid int primary key,
pname varchar(20) not null unique,
qty int check(qty >0) default 10,
price double(9,2) check(price>0),
catid int,
foreign key fk_cid(catid) references category(cid)
);

insert into product values(10,'lays',23,40.00,1);

insert into product values(11,'kurkure',23,40.00,100);

insert into product values(12,'nachos',23,140.00,1);
insert into product(pid,pname) values(13,'coca cola');

insert into product values(14,'pepsi',23,40.00,2);

insert into product values(15,'miranda',23,140.00,2);




```


## 5write a procedure to display all pid,pname,cid,cname and salesman name(use
product,category and salesman table)


```sql


delimiter //
create procedure productcategory()
begin

    select pid,pname,cid,cname
    from product ,category;
 
end//

delimiter ;


//ANS ---

mysql>
mysql> delimiter ;
mysql> call productcategory;
+-----+-----------+-----+------------+
| pid | pname     | cid | cname      |
+-----+-----------+-----+------------+
|  13 | coca cola |   3 | snacks     |
|  13 | coca cola |   2 | cold drink |
|  13 | coca cola |   1 | chips      |
|  10 | lays      |   3 | snacks     |
|  10 | lays      |   2 | cold drink |
|  10 | lays      |   1 | chips      |
|  15 | miranda   |   3 | snacks     |
|  15 | miranda   |   2 | cold drink |
|  15 | miranda   |   1 | chips      |
|  12 | nachos    |   3 | snacks     |
|  12 | nachos    |   2 | cold drink |
|  12 | nachos    |   1 | chips      |
|  14 | pepsi     |   3 | snacks     |
|  14 | pepsi     |   2 | cold drink |
|  14 | pepsi     |   1 | chips      |
+-----+-----------+-----+------------+
15 rows in set (0.00 sec)

Query OK, 0 rows affected (0.03 sec)


```






9) Write a procedure and a function.
Function: write a function to calculate number of years of experience of employee.(note:
pass hiredate as a parameter)


```sql

delimiter //
create procedure experience(in hire date )
begin

    select ename,timestampdiff(year,hiredate,now()) experience
    from emp
    where hiredate=hire;
 
end//

delimiter ;


## Ans ---- mysql> call experience('1981-06-09');
+-------+------------+
| ename | experience |
+-------+------------+
| CLARK |         41 |
+-------+------------+
1 row in set (0.00 sec)

Query OK, 0 rows affected (0.00 sec)



```



```sql


delimiter //
create procedure remark()

begin

select sal , avg(sal) 
from emp
group by deptno;
if vsal>sall
then 'Greater Sal';
if vsal<sall
then 'Less Sal';
else vsal==sall
then 'Equal Sal';
end if
end//
delimiter ;



update emp

set sal = (select e.sal from (select * from emp e) where e.ename='allen';)
where ename='miller';


```