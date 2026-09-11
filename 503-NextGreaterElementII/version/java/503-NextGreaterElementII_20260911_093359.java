// Last updated: 11/09/2026, 09:33:59
1import java.util.*;
2class Solution {
3    public int[] nextGreaterElements(int[] nums) {
4        int n = nums.length;
5        int[] result = new int[n];
6        Arrays.fill(result, -1);
7        Stack<Integer> stack = new Stack<>();
8        for (int i = 0; i < 2 * n; i++) {
9            int index = i % n;
10            while (!stack.isEmpty() &&
11                   nums[stack.peek()] < nums[index]) {
12
13                result[stack.pop()] = nums[index];
14            }
15            if (i < n) {
16                stack.push(index);
17            }
18        }
19        return result;
20    }
21}