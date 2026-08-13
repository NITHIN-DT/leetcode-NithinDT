// Last updated: 13/08/2026, 15:17:00
1import java.util.*;
2
3class Solution {
4    public int minimumPushes(String word) {
5        int[] freq = new int[26];
6
7        // Count frequency of each character
8        for (char c : word.toCharArray()) {
9            freq[c - 'a']++;
10        }
11
12        // Sort frequencies in ascending order
13        Arrays.sort(freq);
14
15        int pushes = 0;
16        int cost = 1;
17        int count = 0;
18
19        // Process from highest frequency to lowest
20        for (int i = 25; i >= 0; i--) {
21            if (freq[i] == 0) {
22                break;
23            }
24
25            pushes += freq[i] * cost;
26            count++;
27
28            // Every 8 characters, increase the push cost
29            if (count % 8 == 0) {
30                cost++;
31            }
32        }
33
34        return pushes;
35    }
36}