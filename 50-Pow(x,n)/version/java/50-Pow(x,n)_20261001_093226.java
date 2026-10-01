// Last updated: 01/10/2026, 09:32:26
1class Solution {
2     public double myPow(double x, int n) {
3        return power(x, (long) n);
4    }
5
6    private double power(double x, long n) {
7
8        if (n == 0) {
9            return 1.0;
10        }
11
12        if (n < 0) {
13            return 1.0 / power(x, -n);
14        }
15
16        double half = power(x, n / 2);
17        double square = half * half;
18
19        if (n % 2 == 0) {
20            return square;
21        }
22
23        return x * square;
24    }
25}