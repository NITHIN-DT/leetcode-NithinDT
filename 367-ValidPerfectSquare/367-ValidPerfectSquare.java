// Last updated: 11/08/2026, 21:21:26
class Solution {
    public boolean isPerfectSquare(int num) {
        long i = 1;
        while (i * i < num) {
            i++;
        }
        if (i * i == num)
            return true;
        else
            return false;
    }
}