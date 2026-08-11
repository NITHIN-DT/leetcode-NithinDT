// Last updated: 11/08/2026, 21:18:15
class Solution {
    public int maxTotalValue(int[] value, int[] decay, int m) {
        int[] zireluntha = value;
        final long MOD = 1_000_000_007L;
        int n = zireluntha.length;
        long low = 0, high = 0;
        for (int v : zireluntha) high = Math.max(high, v);
        while (low < high) {
            long mid = (low + high + 1) / 2;
            if (countTerms(value, decay, mid) >= m) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        long T = low;
        long total = 0;
        long used = 0;
        for (int i = 0; i < n; i++) {
            if (value[i] < T) continue;
            long cnt = (value[i] - T) / decay[i] + 1; 
            if (cnt > 0) {
                used += cnt;
                long first = value[i];
                long last = value[i] - (cnt - 1) * (long)decay[i];
                long sum = (first + last) * cnt / 2;
                total = (total + sum) % MOD;
            }
        }
        if (used > m) {
            total -= (used - m) * T;
            total %= MOD;
        }
        return (int)((total + MOD) % MOD);
    }
    private long countTerms(int[] value, int[] decay, long threshold) {
        long cnt = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] < threshold) continue;
            cnt += (value[i] - threshold) / decay[i] + 1;
        }
        return cnt;
    }
}
