// Last updated: 29/09/2026, 10:07:22
1class Solution {
2    public int removePalindromeSub(String s) {
3        if (s.length() == 0)
4            return 0;
5        int i = 0;
6        int j = s.length() - 1;
7        while (i < j) {
8            if (s.charAt(i) != s.charAt(j))
9                return 2;
10            i++;
11            j--;
12        }
13        return 1;
14    }
15}