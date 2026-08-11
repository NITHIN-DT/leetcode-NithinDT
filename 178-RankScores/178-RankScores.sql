-- Last updated: 11/08/2026, 21:23:06
# Write your MySQL query statement below
SELECT
    Score,
    DENSE_RANK() OVER (ORDER BY Score DESC) AS 'Rank'
FROM Scores;