-- Last updated: 11/08/2026, 21:19:44
SELECT q1.person_name
FROM Queue q1
WHERE (
    SELECT SUM(q2.weight)
    FROM Queue q2
    WHERE q2.turn <= q1.turn
) <= 1000
ORDER BY q1.turn DESC
LIMIT 1;