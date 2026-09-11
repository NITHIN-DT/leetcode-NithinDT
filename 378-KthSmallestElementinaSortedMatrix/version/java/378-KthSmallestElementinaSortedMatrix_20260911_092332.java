// Last updated: 11/09/2026, 09:23:32
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n = matrix.length;
4        int low = matrix[0][0];
5        int high = matrix[n - 1][n - 1];
6        while (low < high) {
7            int mid = low + (high - low) / 2;
8            int count = 0;
9            for (int i = 0; i < n; i++) {
10
11                for (int j = 0; j < n; j++) {
12
13                    if (matrix[i][j] <= mid) {
14                        count++;
15                    } else {
16                        break;
17                    }
18                }
19            }
20            if (count < k) {
21                low = mid + 1;
22            } 
23            else {
24                high = mid;
25            }
26        }
27        return low;
28    }
29}