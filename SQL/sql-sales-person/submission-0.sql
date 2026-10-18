with not_crimson_orders as (select o.sales_id
from orders o join company c on o.com_id = c.com_id
group by o.sales_id
having count(*) filter (where c.name = 'CRIMSON') = 0)

select name
from sales_person s
where s.sales_id IN (select * from not_crimson_orders)
OR s.sales_id NOT IN (select sales_id from orders)