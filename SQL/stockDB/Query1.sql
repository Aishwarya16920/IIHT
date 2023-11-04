create schema stockDB;
use stockDB;

create table StockMaster(
	stock_id integer, 
    stock_title varchar(50), 
    unit_of_measure varchar(10)
);
insert into StockMaster values(1, "Rice", "Kg");
insert into StockMaster values(2, "Potatoes", "Kg");
insert into StockMaster values(3, "Bananas", "Kg");
insert into StockMaster values(4, "Sugar", "g");
insert into StockMaster values(5, "Milk", "l");
insert into StockMaster values(6, "Oil", "l");


create table InStock(
	stock_id integer,
    purchase_date date,
    quantity_purchased integer,
    purchase_cost integer
);
insert into InStock values(1, "2022-06-10", 80, 8000);
insert into InStock values(2, "2022-06-15", 25, 5000);
insert into InStock values(5, "2022-06-20", 10, 10000);

create table OutStock(
	stock_id integer, 
    selling_date date, 
    quantity_sold integer, 
    selling_price integer
);
insert into OutStock values(3, "2022-08-01", 50, 7000);
insert into OutStock values(4, "2022-08-16", 500, 1000);
insert into OutStock values(6, "2022-08-23", 20, 4000);

select count(*) as 'Total Records' from StockMaster;
select count(*) as 'Total Records' from InStock;
select count(*) as 'Total Records' from OutStock;

select * from StockMaster;
select * from InStock;
select * from OutStock;

select stock_id, stock_title from StockMaster;
select stock_id, purchase_date from InStock;
select stock_id, selling_date, quantity_sold from OutStock;

select * from OutStock where quantity_sold > 50;
select * from StockMaster where stock_title like 'A%'; 
select * from InStock where purchase_date between '2022-06-10' and '2022-06-20';