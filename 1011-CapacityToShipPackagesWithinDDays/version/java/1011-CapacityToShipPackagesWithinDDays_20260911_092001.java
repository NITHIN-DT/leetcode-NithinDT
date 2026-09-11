// Last updated: 11/09/2026, 09:20:01
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int low = 0;
4        int high = 0;
5        for (int weight : weights) {
6            low = Math.max(low, weight);
7            high += weight;
8        }
9        while (low < high) {
10            int mid = low + (high - low) / 2;
11            int currentWeight = 0;
12            int requiredDays = 1;
13            for (int weight : weights) {
14                if (currentWeight + weight > mid) {
15                    requiredDays++;
16                    currentWeight = 0;
17                }
18                currentWeight += weight;
19            }
20            if (requiredDays > days) {
21                low = mid + 1;
22            } 
23            else {
24                high = mid;
25            }
26        }
27        return low;
28    }
29}