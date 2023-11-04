use stockDB;

select stock_id, purchase_date, count(*) as count from InStock group by purchase_date;

select sum(quantity_purchased) as total from InStock;

select stock_id as stock_id_max from InStock where purchase_cost = (select max(purchase_cost) from InStock);
select stock_id as stock_id_min from InStock where purchase_cost = (select min(purchase_cost) from InStock);

select stock_id, selling_date, quantity_sold from OutStock group by selling_date;