// Last updated: 01/10/2026, 09:40:43
1class Solution {
2    public int countPrimes(int n) {
3        if (n <= 1) {
4            return 0;
5        }
6        int count = 0;
7        boolean[] isprime = new boolean[n];
8        Arrays.fill(isprime, true);
9        for (int i = 2; i * i < n; i++) {
10            if (isprime[i] == true) {
11                for (int j = i * i; j < n; j = j + i) {
12                    isprime[j] = false;
13                }
14            }
15        }
16        for (int i = 2; i < n; i++) {
17            if (isprime[i] == true) {
18                count++;
19            }
20        }
21        return count;
22    }
23}
24