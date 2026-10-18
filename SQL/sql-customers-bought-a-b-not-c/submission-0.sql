-- Write your query below
with orders_customers as (
select customer_id
from orders o
group by customer_id
having count(distinct product_name) filter (where product_name in ('A', 'B')) = 2
AND count(*) filter (where product_name = 'C') = 0
)

select c.customer_id, c.customer_name
from customers c
where c.customer_id in (select * from orders_customers)
order by customer_name;
