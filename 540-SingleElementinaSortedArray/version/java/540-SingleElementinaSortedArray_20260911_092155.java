// Last updated: 11/09/2026, 09:21:55
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int low = 0;
4        int high = nums.length - 1;
5        while (low < high) {
6            int mid = low + (high - low) / 2;
7            if (mid % 2 == 1) {
8                mid--;
9            }
10            if (nums[mid] == nums[mid + 1]) {
11                low = mid + 2;
12            } 
13            else {
14                high = mid;
15            }
16        }
17        return nums[low];
18    }
19}