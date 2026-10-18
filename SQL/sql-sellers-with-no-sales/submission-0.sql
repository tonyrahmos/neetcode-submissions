-- Write your query below
select seller_name
from seller s
where seller_id NOT IN 
(select seller_id from orders o where extract(YEAR from sale_date) = 2020)
order by seller_name