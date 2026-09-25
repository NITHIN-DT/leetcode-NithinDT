// Last updated: 25/09/2026, 09:07:43
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        int low = 0;
8        int high = m * n - 1;
9
10        while (low <= high) {
11
12            int mid = low + (high - low) / 2;
13
14            // Convert 1D index to 2D index
15            int row = mid / n;
16            int col = mid % n;
17
18            if (matrix[row][col] == target) {
19                return true;
20            }
21            else if (matrix[row][col] < target) {
22                low = mid + 1;
23            }
24            else {
25                high = mid - 1;
26            }
27        }
28
29        return false;
30    }
31}