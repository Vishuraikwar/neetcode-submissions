class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Return 0 if the array is empty.
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num); // Add all elements to the set.
        }

        int longestStreak = 0;

        for (int num : set) {
            // Check if it's the start of a sequence.
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count the length of the sequence.
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak; // Return the length of the longest sequence.
    }
}
