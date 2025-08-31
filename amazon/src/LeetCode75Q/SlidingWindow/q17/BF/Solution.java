package LeetCode75Q.SlidingWindow.q17.BF;

public class Solution {
    public static int characterReplacement(String s, int k) {
        int n = s.length();
        if (n == 0) return 0;
        int maxLength = 0;

        for (int start = 0; start < n; start++) {
            int[] freq = new int[26];
            int maxFreq = 0;

            for (int end = start; end < n; end++) {
                char c = s.charAt(end);
                int idx = c - 'A';
                freq[idx]++;
                if (freq[idx] > maxFreq) {
                    maxFreq = freq[idx];
                }

                int windowLength = end - start + 1;
                int replacementsNeeded = windowLength - maxFreq;

                if (replacementsNeeded <= k) {
                    if (windowLength > maxLength) {
                        maxLength = windowLength;
                    }
                } else {
                    break; // No need to extend further for this start
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {

    }
}