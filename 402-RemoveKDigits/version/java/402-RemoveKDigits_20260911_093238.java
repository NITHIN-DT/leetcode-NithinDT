// Last updated: 11/09/2026, 09:32:38
1import java.util.*;
2class Solution {
3    public String removeKdigits(String num, int k) {
4        Stack<Character> stack = new Stack<>();
5        for (char digit : num.toCharArray()) {
6            while (!stack.isEmpty() &&
7                   k > 0 &&
8                   stack.peek() > digit) {
9
10                stack.pop();
11                k--;
12            }
13            stack.push(digit);
14        }
15        while (k > 0) {
16            stack.pop();
17            k--;
18        }
19        StringBuilder result = new StringBuilder();
20        for (char digit : stack) {
21            result.append(digit);
22        }
23        int i = 0;
24        while (i < result.length() && result.charAt(i) == '0') {
25            i++;
26        }
27        result = new StringBuilder(result.substring(i));
28        if (result.length() == 0) {
29            return "0";
30        }
31        return result.toString();
32    }
33}