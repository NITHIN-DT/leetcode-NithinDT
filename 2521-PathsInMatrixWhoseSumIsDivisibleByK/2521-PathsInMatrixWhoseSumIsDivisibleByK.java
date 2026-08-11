// Last updated: 11/08/2026, 21:19:00
import java.util.*;

class Solution {

    private int[][][] memo;
    private int MOD = 1_000_000_007;
    private int[][] grid;
    private int m, n, k;

    public int numberOfPaths(int[][] grid, int k) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        this.k = k;

        memo = new int[m][n][k];
        for (int[][] row : memo) {
            for (int[] arr : row) {
                Arrays.fill(arr, -1);
            }
        }

        return dfs(0, 0, 0);
    }

    private int dfs(int i, int j, int sumMod) {
        if (i >= m || j >= n) return 0;

        sumMod = (sumMod + grid[i][j]) % k;

        if (i == m - 1 && j == n - 1) {
            return sumMod == 0 ? 1 : 0;
        }

        if (memo[i][j][sumMod] != -1) {
            return memo[i][j][sumMod];
        }

        int right = dfs(i, j + 1, sumMod);
        int down = dfs(i + 1, j, sumMod);

        return memo[i][j][sumMod] = (int)((right + down) % MOD);
    }
}