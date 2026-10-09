// Last updated: 09/10/2026, 09:43:10
1class Solution {
2    public String addStrings(String num1, String num2) {
3        int i = num1.length() - 1;
4        int j = num2.length() - 1;
5        int carry = 0;
6        StringBuilder result = new StringBuilder();
7        while (i >= 0 || j >= 0 || carry > 0) {
8            int sum = carry;
9            if (i >= 0) {
10                sum += num1.charAt(i) - '0';
11                i--;
12            }
13            if (j >= 0) {
14                sum += num2.charAt(j) - '0';
15                j--;
16            }
17            result.append(sum % 10);
18            carry = sum / 10;
19        }
20        return result.reverse().toString();
21    }
22}