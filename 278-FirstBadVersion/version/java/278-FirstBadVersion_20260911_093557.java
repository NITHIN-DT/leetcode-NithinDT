// Last updated: 11/09/2026, 09:35:57
1public class Solution extends VersionControl {
2    public int firstBadVersion(int n) {
3        int low = 1;
4        int high = n;
5        while (low < high) {
6            int mid = low + (high - low) / 2;
7            if (isBadVersion(mid)) {
8                high = mid;
9            } 
10            else {
11                low = mid + 1;
12            }
13        }
14        return low;
15    }
16}