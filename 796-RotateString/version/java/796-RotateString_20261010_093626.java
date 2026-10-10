// Last updated: 10/10/2026, 09:36:26
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.length()!=goal.length())
4            return false;
5        String str=s+s;
6        return str.contains(goal);
7    }
8}