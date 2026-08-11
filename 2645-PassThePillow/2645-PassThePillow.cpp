// Last updated: 11/08/2026, 21:18:52
class Solution {
public:
    int passThePillow(int n, int time) {
        int cycle = time / (n - 1);
         int pos = time % (n - 1); 
         if (cycle % 2 == 0) { // Even cycle → moving forward 
         return 1 + pos; } else { // Odd cycle → moving backward 
         return n - pos; }
    }
};