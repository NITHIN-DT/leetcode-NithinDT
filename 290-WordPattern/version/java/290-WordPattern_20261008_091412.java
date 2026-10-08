// Last updated: 08/10/2026, 09:14:12
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] words = s.split(" ");  
4        if (pattern.length() != words.length) {
5            return false;}
6        HashMap<Character, String> charToWord = new HashMap<>();
7        HashSet<String> seenWords = new HashSet<>();
8        for (int i = 0; i < pattern.length(); i++) {
9            char c = pattern.charAt(i);
10            String w = words[i];
11
12            if (charToWord.containsKey(c)) {
13                if (!charToWord.get(c).equals(w)) {
14                    return false;}
15            } else {
16                if (seenWords.contains(w)) {
17                    return false;}
18                charToWord.put(c, w);
19                seenWords.add(w);}}
20        return true;
21    }
22}