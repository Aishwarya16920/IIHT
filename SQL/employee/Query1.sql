create schema employee;
use employee;

begin;
create table dept(
	dept_id integer,
    dname varchar(15),
    dloc varchar(15),
    primary key (dept_id)
);

create table employee(
	empid integer, 
    ename varchar(15), 
    job varchar(15),
    deptid integer,
    sal integer,
    primary key (empid),
    foreign key (deptid) references dept(dept_id)
);

insert into dept values(100, 'Sales', 'Chennai');
insert into dept values(101, 'Development', 'Pune');
insert into dept values(102, 'Accounting', 'Bangalore');
insert into employee values(201, 'Ajay', 'Salesman', 100, 50000);
insert into employee values(202, 'Catherine', 'Manager', 100, 60000);
insert into employee values(203, 'Zara', 'Engineer', 101, 75000);
insert into employee values(204, 'Yash', 'Engineer', 101, 75000);
insert into employee values(205, 'Karan', 'Manager', 102, 70000);
insert into employee values(206, 'Ram', 'Manager', 102, 70000);

commit;
select ename, empid, dname, job, dloc, sal  from employee, dept  where employee.deptid = dept.dept_id  order by empid;
rollback;