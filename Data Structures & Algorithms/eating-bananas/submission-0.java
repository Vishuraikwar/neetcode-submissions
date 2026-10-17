public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = getMax(piles); // Range for k
        while (left < right) {
            int mid = (left + right) / 2; // Try middle value of k
            if (canEatAll(piles, h, mid)) {
                right = mid; // Try smaller k
            } else {
                left = mid + 1; // Try larger k
            }
        }
        return left; // Smallest valid k
    }

    private boolean canEatAll(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; // Calculate hours for each pile
            if (hours > h) {
                return false; // Too slow to finish in h hours
            }
        }
        return true;
    }

    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile); // Find the largest pile
        }
        return max;
    }
}
