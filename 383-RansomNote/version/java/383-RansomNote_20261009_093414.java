// Last updated: 09/10/2026, 09:34:14
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        int[] count = new int[26];
4        for (char c : magazine.toCharArray()) {
5            count[c - 'a']++;
6        }
7        for (char c : ransomNote.toCharArray()) {
8            count[c - 'a']--;
9            if (count[c - 'a'] < 0) {
10                return false;
11            }
12        }
13        return true;
14    }
15}