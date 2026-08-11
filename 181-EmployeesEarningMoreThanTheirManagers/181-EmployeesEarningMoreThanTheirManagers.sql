-- Last updated: 11/08/2026, 21:23:01
SELECT e.name AS Employee
FROM Employee e JOIN Employee m
ON e.managerId=m.id
WHERE e.salary>m.salary;