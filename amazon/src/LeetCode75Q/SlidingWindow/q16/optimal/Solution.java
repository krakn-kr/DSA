package LeetCode75Q.SlidingWindow.q16.optimal;

import java.util.Arrays;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex,-1);
        int left = 0;
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            if(charIndex[currentChar]>=left){
                left = charIndex[currentChar]+1;
            }
            charIndex[currentChar] = right;
            maxLength = Math.max(maxLength,right-left+1);
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

