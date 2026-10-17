

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // Frequency map for characters in t
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int required = map.size(); // Number of unique characters in t
        int formed = 0; // To track how many characters in s match the frequency in t
        int l = 0, r = 0; // Left and right pointers
        int[] ans = {-1, 0, 0}; // To store the result: {window length, left, right}

        // Current window's character frequency map
        HashMap<Character, Integer> window = new HashMap<>();

        while (r < s.length()) {
            // Add the current character to the window
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            // Check if current window contains all characters of t
            if (map.containsKey(c) && window.get(c).intValue() == map.get(c).intValue()) {
                formed++;
            }

            // Try to shrink the window if it contains all characters of t
            while (l <= r && formed == required) {
                c = s.charAt(l);
                if (r - l + 1 < ans[0] || ans[0] == -1) {
                    ans[0] = r - l + 1; // Update the minimum window size
                    ans[1] = l; // Update the left pointer
                    ans[2] = r; // Update the right pointer
                }

                // Shrink the window from the left
                window.put(c, window.get(c) - 1);
                if (map.containsKey(c) && window.get(c).intValue() < map.get(c).intValue()) {
                    formed--;
                }

                l++; // Move the left pointer to shrink the window
            }

            r++; // Expand the window by moving the right pointer
        }

        // If we found a valid window, return it, otherwise return an empty string
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}

