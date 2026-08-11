// Last updated: 11/08/2026, 21:18:30
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;

        while (mainTank > 0) {
            // consume 1 liter
            mainTank--;
            distance += 10;

            // every 5 liters consumed → transfer 1 liter if available
            if (distance % 50 == 0 && additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }

        return distance;
    }
}