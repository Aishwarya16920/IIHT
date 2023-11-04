use stockDB;

insert into StockMaster values(7, 'Tomatoes', 'kg');
insert into StockMaster values(8, 'Watermelons', 'kg');
insert into InStock values(8, '2022-07-20', 50, 5000);
insert into OutStock values(7, '2022-08-16', 1000, 10000);

insert into StockMaster (stock_id, stock_title) values (9, 'Onions');

insert into OutStock (stock_id, selling_date, quantity_sold) values (9, '2022-08-23', 2000);

select * from StockMaster;
select * from InStock;
select * from OutStock;


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

select ename, empid, dname, job, dloc, sal  from employee, dept  where employee.deptid = dept.dept_id  order by empid;