-- Last updated: 11/08/2026, 21:22:58
# Write your MySQL query statement below
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(*) > 1;