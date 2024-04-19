# Write your MySQL query statement below
SELECT product_name, year, price
FROM Sales AS s
JOIN Product AS p 
WHERE s.product_id = p.product_id 
ORDER BY s.sale_id ASC;