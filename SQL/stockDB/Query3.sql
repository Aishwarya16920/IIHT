use stockDB;

select * from StockMaster, InStock, OutStock;

select * from StockMaster inner join OutStock on StockMaster.stock_id = OutStock.stock_id;

select * from StockMaster inner join InStock on StockMaster.stock_id = InStock.stock_id;

select * from InStock left join Outstock on InStock.stock_id = OutStock.stock_id;

select * from InStock natural join StockMaster;