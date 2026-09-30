// Last updated: 30/09/2026, 10:17:16
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum = 0;
4        for (int i = 0; i < k; i++) {
5            sum += nums[i];
6        }
7        int maxSum = sum;
8        for (int i = k; i < nums.length; i++) {
9            sum = sum + nums[i] - nums[i - k];
10            maxSum = Math.max(maxSum, sum);
11        }
12        return (double) maxSum / k;
13    }
14}