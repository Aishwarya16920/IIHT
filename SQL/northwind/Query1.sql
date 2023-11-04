use northwind;

SELECT 
    cust.first_name AS 'First Name',
    cust.last_name AS 'Last Name',
    ord.ship_address AS 'Street',
    ord.ship_city AS 'City',
    ord.ship_state_province AS 'State',
    ord.ship_zip_postal_code AS 'Zip',
    ord.ship_country_region AS 'Country',
    shippers.company AS 'Shipper',
    DATE_FORMAT(ord.order_date, '%M %D %Y') AS 'Order Date',
    products.product_code AS 'Product Code',
    products.product_name AS 'Product Name',
    FORMAT(ord_det.quantity, 0) AS 'Qty Ordered',
    FORMAT(products.standard_cost, 2) AS 'Cost',
    FORMAT(ord_det.quantity * products.standard_cost,
        2) AS 'Total Cost'
FROM
    orders AS ord
        JOIN
    order_details AS ord_det ON ord.id = ord_det.order_id
        JOIN
    customers AS cust ON ord.customer_id = cust.id
        JOIN
    shippers ON shippers.id = ord.shipper_id
        JOIN
    products ON ord_det.product_id = products.id;
    
    
SELECT 
    DATE_FORMAT(order_date, '%Y - %m') AS 'Sales Month',
    ord.ship_state_province AS 'State',
    CONCAT('$',
            FORMAT((odt.quantity * products.list_price),
                2)) AS 'Total Sales'
FROM
    orders AS ord
        JOIN
    order_details odt ON ord.id = odt.order_id
        JOIN
    products ON odt.product_id = products.id
WHERE
    odt.status_id = 2
GROUP BY DATE_FORMAT(order_date, '%Y - %m') , ord.ship_state_province
ORDER BY 'Sales Month' ASC;


create or replace view some_name as select * from products;
select * from some_name;
drop view some_name;























 