use employee;

create or replace view emp as select * from employee;
create or replace view department as select * from dept;

create or replace view emp1 as select * from employee where deptid = 100 and sal > 5000;

set sql_safe_updates = 0;
update employee set sal = 4000 where sal > 5000; 
select * from emp1; 

drop view emp,emp1,department;