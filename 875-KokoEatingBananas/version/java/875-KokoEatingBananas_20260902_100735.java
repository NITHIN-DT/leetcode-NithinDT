// Last updated: 02/09/2026, 10:07:35
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int left = 1;
4        int right = 0;
5        for (int pile : piles) {
6            right = Math.max(right, pile);
7        }
8        while (left < right) {
9            int mid = left + (right - left) / 2;
10            if (canFinish(piles, mid, h)) {
11                right = mid; // Try a smaller speed
12            } else {
13                left = mid + 1; // Increase the speed
14            }
15        }
16        return left;
17    }
18    private boolean canFinish(int[] piles, int speed, int h) {
19        long hours = 0;
20        for (int pile : piles) {
21            hours += (pile + speed - 1) / speed;
22            if (hours > h) {
23                return false;
24            }
25        }
26        return hours <= h;
27    }
28}