// Last updated: 11/09/2026, 09:30:26
1import java.util.*;
2class Solution {
3    public int subarraysWithKDistinct(int[] nums, int k) {
4        return atMost(nums, k) - atMost(nums, k - 1);
5    }
6    public int atMost(int[] nums, int k) {
7        int left = 0;
8        int count = 0;
9        HashMap<Integer, Integer> map = new HashMap<>();
10        for (int right = 0; right < nums.length; right++) {
11            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
12            while (map.size() > k) {
13                map.put(nums[left], map.get(nums[left]) - 1);
14                if (map.get(nums[left]) == 0) {
15                    map.remove(nums[left]);
16                }
17
18                left++;
19            }
20            count += right - left + 1;
21        }
22        return count;
23    }
24}