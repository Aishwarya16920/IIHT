create schema persons;
use persons;
create table persons(
	FirstName varchar(20),
    LastName varchar(20)
);

insert into 
	persons (FirstName, LastName) 
values
	('Aishwarya','M'),
    ('Aravind','Kumar'),
    ('Bala', 'S'),
    ('Sathish', 'Kumar'),
    ('Akshay', 'M');

select * from persons;

select * from persons where FirstName like 'A%';

create procedure getPersons
as
select FirstName as 'Input', LastName as 'Output' from persons
go;
execute getPersons;

set sql_safe_updates=0;
delete from persons;