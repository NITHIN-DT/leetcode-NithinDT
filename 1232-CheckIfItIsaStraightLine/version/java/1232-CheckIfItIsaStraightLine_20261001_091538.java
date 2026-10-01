// Last updated: 01/10/2026, 09:15:38
1class Solution {
2    public boolean checkStraightLine(int[][] coordinates) {
3        int x1=coordinates[0][0];
4        int y1=coordinates[0][1];
5        int x2=coordinates[1][0];
6        int y2=coordinates[1][1];
7        for(int i=2;i<coordinates.length;i++){
8            int x3=coordinates[i][0];
9            int y3=coordinates[i][1];
10            if((y2-y1)*(x3-x1)!=(y3-y1)*(x2-x1)){
11                return false;
12            }
13        }
14        return true;
15    }
16}