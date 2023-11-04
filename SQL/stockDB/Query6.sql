use stockDB;

set sql_safe_updates=0;
select * from employee;

delete from employee where sal > 10000;

delete from employee where deptid = 100;

alter table employee drop ename;

drop table employee;