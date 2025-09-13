package LeetCode75Q.HashTable.q26.BF;

import java.util.Arrays;

public class Solution {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        // Sort both strings
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Compare sorted strings
        return Arrays.equals(s1Array, s2Array);
    }
    public static void main(String[] args) {
        {
            String s = "anagram", t = "nagaram";
            boolean anagram = isAnagram(s, t);
            System.out.println("output: " + anagram);
        }
        {
            String s = "rat", t = "car";
            boolean anagram = isAnagram(s, t);
            System.out.println("output: " + anagram);
        }
    }
}
