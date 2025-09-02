package LeetCode75Q.SlidingWindow.q18.optimal;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String minWindow(String s, String t) {
        if(s == null || t == null ||s.length()<t.length()) return "";

        // Create frequency map for characters in t
        Map<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }
        int left = 0;          // Left pointer of the sliding window
        int right = 0;         // Right pointer of the sliding window
        int minLen = Integer.MAX_VALUE; // Length of the minimum window found
        int start = 0;         // Starting index of the minimum window
        int counter = 0; // Tracks how many characters from t are still needed
        while(right<s.length()) {
            char currentChar = s.charAt(right);
            if (tFreq.getOrDefault(currentChar, 0) > 0) {
                counter++;
            }
            tFreq.put(currentChar, tFreq.getOrDefault(currentChar, 0) - 1);
            while (counter == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                tFreq.put(leftChar, tFreq.get(leftChar) + 1);
                if (tFreq.get(leftChar) > 0) {
                    counter--;
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start+minLen);
    }
    public static void main(String[] args) {
        {
            String s = "ADOBECODEBANC", t = "ABC";
            String output = minWindow(s,t);
            System.out.println("s= "+s+"\nt= "+t+"\noutput= "+output);
        }
        {
            String  s = "a", t = "a";
            String output = minWindow(s,t);
            System.out.println("s= "+s+"\nt= "+t+"\noutput= "+output);
        }
        {
            String  s = "a", t = "aa";
            String output = minWindow(s,t);
            System.out.println("s= "+s+"\nt= "+t+"\noutput= "+output);
        }
    }
}

