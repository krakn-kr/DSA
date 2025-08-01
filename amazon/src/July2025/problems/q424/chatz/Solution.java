package July2025.problems.q424.chatz;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hi");
        {
            String s = "ABAB";
            int k = 1;
           int result =  characterReplacement(s,k);
            System.out.println("result:"+result);
        }
        {
            String s = "AABABBA";
            int k = 1;
            int result =  characterReplacement(s,k);
            System.out.println("result:"+result);
        }
    }
    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxFrequency = Math.max(maxFrequency, count[s.charAt(right) - 'A']);

            if ((right - left + 1) - maxFrequency > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
