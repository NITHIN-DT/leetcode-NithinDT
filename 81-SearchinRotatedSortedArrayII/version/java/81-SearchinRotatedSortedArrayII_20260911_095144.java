// Last updated: 11/09/2026, 09:51:44
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int low = 0;
4        int high = nums.length - 1;
5        while (low <= high) {
6            int mid = low + (high - low) / 2;
7            if (nums[mid] == target) {
8                return true;
9            }
10            if (nums[low] == nums[mid] &&
11                nums[mid] == nums[high]) {
12                low++;
13                high--;
14            }
15            else if (nums[low] <= nums[mid]) {
16                if (nums[low] <= target &&
17                    target < nums[mid]) {
18
19                    high = mid - 1;
20                } 
21                else {
22                    low = mid + 1;
23                }
24            }
25            else {
26                if (nums[mid] < target &&
27                    target <= nums[high]) {
28
29                    low = mid + 1;
30                } 
31                else {
32                    high = mid - 1;
33                }
34            }
35        }
36        return false;
37    }
38}