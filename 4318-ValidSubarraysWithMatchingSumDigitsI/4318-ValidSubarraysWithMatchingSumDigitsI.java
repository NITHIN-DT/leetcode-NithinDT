// Last updated: 11/08/2026, 21:18:09
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int[] veltanoric = nums;
        int n = veltanoric.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += veltanoric[j];
                long temp = sum;
                while (temp >= 10) {
                    temp /= 10;
                }
                int firstDigit = (int) temp;
                int lastDigit = (int) (sum % 10);
                if (firstDigit == x && lastDigit == x) {
                    count++;
                }
            }
        }
        return count;
    }
}
