package LeetCode75Q.SlidingWindow.q16.BF;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(allUnique(s,i,j)){
                    maxLength = Math.max(maxLength,j-i+1);
                }
            }
        }
        return maxLength;
    }
    public static boolean allUnique(String s,int start, int end){
        boolean[] seen = new boolean[128];
        for (int i = start; i <=end ; i++) {
            char c = s.charAt(i);
            if(seen[c]) return false;
            seen[c] = true;
        }

        return true;
    }
    public static void main(String[] args) {
        {
            String s = "abcabcbb";
            int output = lengthOfLongestSubstring(s);
            System.out.println("input=  "+s+"\noutput= "+output);
        }
        {
            String s = "bbbbb";
            int output = lengthOfLongestSubstring(s);
            System.out.println("input=  "+s+"\noutput= "+output);
        }
        {
            String s = "pwwkew";
            int output = lengthOfLongestSubstring(s);
            System.out.println("input=  "+s+"\noutput= "+output);
        }
    }
}
