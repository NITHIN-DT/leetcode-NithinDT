// Last updated: 29/09/2026, 10:04:25
1class Solution {
2    public int minimumMoves(String s) {
3        int c=0;
4        int i=0;
5        while(i<s.length()){
6            if(s.charAt(i)=='X'){
7                c++;
8                i+=3;
9            }else{
10                i++;
11            }
12        }
13        return c;
14    }
15}