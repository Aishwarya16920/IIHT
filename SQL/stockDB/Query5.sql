use stockDB;

insert into employee values(207, 'Priya', 'Salesman', 100, 4000);
set sql_safe_updates=0;

update employee set sal = sal + 1000 where sal < 5000;

update employee set job = 'Sales Person' where job = 'Salesman';

select * from employee;

update dept set dloc = 'Hyderabad' where dloc = 'Chennai';

select * from dept;