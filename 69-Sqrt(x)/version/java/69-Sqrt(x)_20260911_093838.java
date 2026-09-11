// Last updated: 11/09/2026, 09:38:38
1class Solution {
2    public int mySqrt(int x) {
3        if (x < 2) {
4            return x;
5        }
6        int low = 1;
7        int high = x / 2;
8        while (low <= high) {
9            int mid = low + (high - low) / 2;
10            if (mid <= x / mid) {
11                low = mid + 1;
12            } 
13            else {
14                high = mid - 1;
15            }
16        }
17        return high;
18    }
19}