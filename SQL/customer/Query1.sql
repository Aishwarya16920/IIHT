create schema customer;
use customer;
create table customers (
	customer_id integer,
    first_name varchar(30),
    last_name varchar(30),
    address varchar(100),
    city varchar(100),
    state varchar(2),
    zip_code varchar(10)
);
insert into customers values (1234, 'Michael', 'Weston', '123 Brickel', 'Miami', 'FL', '3313'); 
insert into customers values (5678, 'Aishwarya', 'M', '456 XYZ', 'Chennai', 'TN', '0116');
select * from customers;