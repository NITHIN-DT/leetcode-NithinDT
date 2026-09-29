// Last updated: 29/09/2026, 09:57:47
1class Solution {
2    public int vowelStrings(String[] words, int left, int right) {
3        int count = 0;
4        for (int i = left; i <= right; i++) {
5            String word = words[i];
6            char first = word.charAt(0);
7            char last = word.charAt(word.length() - 1);
8            if (isVowel(first) && isVowel(last)) {
9                count++;
10            }
11        }
12        return count;
13    }
14    private boolean isVowel(char ch) {
15        return ch == 'a' || ch == 'e' || ch == 'i' 
16            || ch == 'o' || ch == 'u';
17    }
18}