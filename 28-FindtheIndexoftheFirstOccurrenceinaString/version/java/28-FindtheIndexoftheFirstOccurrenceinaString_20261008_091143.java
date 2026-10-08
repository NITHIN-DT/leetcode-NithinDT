// Last updated: 08/10/2026, 09:11:43
1class Solution {
2    public int strStr(String haystack, String needle) {
3        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
4            int j = 0;
5            while (j < needle.length() &&
6                   haystack.charAt(i + j) == needle.charAt(j)) {
7                j++;
8            }
9            if (j == needle.length())
10                return i;
11        }
12        return -1;
13    }
14}