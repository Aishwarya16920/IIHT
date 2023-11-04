use employees;
select * from employees;
select count(*) from departments;
select count(*) from dept_emp;
select count(*) from dept_manager;
select count(*) from employees;
select count(*) from salaries;
select count(*) from titles;


SELECT emp_no, count(*) as emp_count
FROM employees
WHERE emp_no > 1
GROUP BY emp_no
HAVING emp_count > 0
ORDER BY emp_no
LIMIT 5,10;
SELECT first_name, last_name 
FROM employees;
SELECT emp_no, salary
FROM salaries;


SELECT first_name as 'First Name', last_name as 'Last Name' 
FROM employees;


select first_name, last_name, concat(first_name, ' ', last_name) as 'Name' from employees;


select salary, 
salary * .01 as weekly, 
salary * .01 * 4 as monthly, 
salary * .01 * 52 as yearly,  
salary + 200 * .01 as multiply_first,
(salary + 200) * .01 as add_first,
salary * .01 / 7 as daily,
salary DIV 3 as div_op,
salary  % 3 as mod_op
from salaries;


select date_format("2017-06-15", "%M %d %Y");
select from_date as original, date_format(from_date, "%M %d %Y") from salaries;


select right('aishu', 2);
select left('aishu',3);
select first_name, last_name, concat(left(first_name, 1), left(last_name, 1)) as Initials from employees;


select * from employees where first_name = 'Elvis';
select * from employees where last_name = 'Elvis';
select * from employees where first_name <> 'Elvis';
select * from employees where first_name != 'Elvis';
select count(*) from employees where first_name = 'Elvis';


select * from employees where first_name = 'Elvis' and gender = 'M';
select * from employees where first_name = 'Elvis' or last_name = 'Velasco';

select * from employees where first_name in('Elvis', 'Sumant', 'Berni', 'Lillian') and last_name not in('Malnik', 'Sluis', 'Bouloucos', 'Warwick');


select * from titles where to_date is null;
select * from information_schema.plugins where plugin_library is null;
select * from information_schema.plugins where plugin_library is not null;


select * from salaries where salary > 66961;
select * from salaries where salary < 66961;


select * from employees where first_name like 'E%' and last_name like '_E%' and last_name not like '%n';


select * from salaries where salary between 66074 and 71046;
select * from employees where birth_date not between '1954-05-01' and '1956-04-20';


select * from salaries order by salary desc;
select * from employees where first_name = 'Elvis' order by gender desc, birth_date asc;

select * from employees limit 20;
select * from employees limit 20, 40;


select distinct first_name from employees;
select distinct birth_date from employees;


select distinct first_name from employees where first_name like 'E%';
select * from employees where first_name in (select distinct first_name from employees where first_name like 'E%');


select first_name, count(*) from employees group by first_name;
select birth_date, count(*) from employees group by birth_date;
select salary, count(*) as sal_count from salaries group by salary order by sal_count desc;


select first_name, count(*) as emp_count from employees group by first_name having emp_count > 250;
select salary, count(*) as sal_count from salaries where from_date > '1994-06-24' group by salary having sal_count > 50 order by sal_count asc;


select date_format(from_date, '%Y') as year, sum(salary) from salaries group by year;


select date_format(from_date, '%Y') as salary_year, min(salary) as min_salary, max(salary) as max_salary from salaries group by salary_year;
select salary_year, max_salary, min_salary, max_salary - min_salary as delta from (select date_format(from_date, '%Y') as salary_year, min(salary) as min_salary, max(salary) as max_salary from salaries group by salary_year) as subselect;


select date_format(from_date, '%Y') as year, avg(salary) as avg_salary, count(*) as total_recs, sum(salary) as salary_sum from salaries group by year;
select avg_salary, salary_sum / total_recs as calculated_avg from(select date_format(from_date, '%Y') as year, avg(salary) as avg_salary, count(*) as total_recs, sum(salary) as salary_sum from salaries group by year) as subselect;


select distinct emp_no from dept_manager;
select * from salaries where emp_no not in(select distinct emp_no from dept_manager);
select date_format(from_date, '%Y') as salary_year, sum(salary) as total_salary, max(salary) as max_salary, min(salary) as min_salary, avg(salary) as avg_salary from salaries where emp_no not in(select distinct emp_no from dept_manager) group by salary_year;


select * from employees inner join dept_manager on employees.emp_no = dept_manager.emp_no;


select * from employees inner join dept_manager on employees.emp_no = dept_manager.emp_no join departments on dept_manager.dept_no = departments.dept_no;


select dept_name, employees.emp_no, first_name, last_name from employees inner join dept_manager on employees.emp_no = dept_manager.emp_no join departments on dept_manager.dept_no = departments.dept_no where dept_manager.to_date = '9999-01-01' and employees.gender = 'F' order by dept_name, last_name;


select dept_name, first_name, last_name, title from employees join dept_emp on employees.emp_no = dept_emp.emp_no join departments on dept_emp.dept_no = departments.dept_no join titles on titles.emp_no =  employees.emp_no where dept_emp.to_date = '9999-01-01' and titles.to_date = '9999-01-01' order by dept_name, last_name;


select dept_name, first_name, last_name, title from employees natural join dept_emp natural join departments natural join titles where dept_emp.to_date = '9999-01-01' and titles.to_date = '9999-01-01' order by dept_name, last_name;


select * from employees where emp_no not in(select emp_no from dept_manager);
select * from employees as emp left join dept_manager as dm on emp.emp_no = dm.emp_no;


select * from employees where emp_no not in (select emp_no from titles where to_date = '9999-01-01');
select * from employees as emp left join titles as t on emp.emp_no = t.emp_no and to_date = '9999-01-01' where t.emp_no is null;





select dept_name, first_name, last_name, title from employees, dept_emp, departments, titles where employees.emp_no = dept_emp.emp_no and dept_emp.dept_no = departments.dept_no and titles.emp_no =  employees.emp_no and dept_emp.to_date = '9999-01-01' and titles.to_date = '9999-01-01' order by dept_name, last_name;


insert into departments values('d999', 'Aishu');
select * from departments;


insert into departments (dept_no, dept_name) values('d998', 'Akshay');
select * from departments;


insert into employees select max(emp_no) + 1, '2000-09-16', 'Aishwarya', 'M', 'F', '2022-06-29' from employees;
select * from employees where first_name = 'Aishwarya';


insert into departments values('d997', 'foo');
update departments set dept_name = 'Social Media Marketing' where dept_no = 'd997';
select * from departments;


insert into departments values('d996', 'foo');
delete from departments where dept_no = 'd996';
select * from departments;


set @foo = 'bar';
select @foo;


create table salaries2 as(select * from salaries);


truncate table salaries2;


drop table if exists salaries2;
























































































































