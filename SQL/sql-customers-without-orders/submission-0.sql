-- Write your query below
with orders_id as (
    select customer_id from orders
)
select name
from customers
where id not in (select * from orders_id);