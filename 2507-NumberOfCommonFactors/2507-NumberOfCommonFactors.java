// Last updated: 11/08/2026, 21:19:04
class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int gcd = gcd(a, b);
        
        for (int i = 1; i <= gcd; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        
        return count;
    }
    
    private int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;

    }
}