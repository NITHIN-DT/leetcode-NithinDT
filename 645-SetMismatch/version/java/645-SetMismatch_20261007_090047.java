// Last updated: 07/10/2026, 09:00:47
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int n = nums.length;
4        int[] count = new int[n + 1];
5        for (int num : nums) {
6            count[num]++;
7        }
8        int duplicate = 0;
9        int missing = 0;
10        for (int i = 1; i <= n; i++) {
11            if (count[i] == 2)
12                duplicate = i;
13            if (count[i] == 0)
14                missing = i;
15        }
16        return new int[]{duplicate, missing};
17    }
18}