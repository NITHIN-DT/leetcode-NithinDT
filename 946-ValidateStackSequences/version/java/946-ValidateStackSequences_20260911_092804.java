// Last updated: 11/09/2026, 09:28:04
1import java.util.*;
2class Solution {
3    public boolean validateStackSequences(int[] pushed, int[] popped) {
4        Stack<Integer> stack = new Stack<>();
5        int j = 0;
6        for (int num : pushed) {
7            stack.push(num);
8            while (!stack.isEmpty() && 
9                   j < popped.length && 
10                   stack.peek() == popped[j]) {
11                stack.pop();
12                j++;
13            }
14        }
15        return j == popped.length;
16    }
17}