package LeetCode75Q.HashTable.q26.optimal;

import java.util.Arrays;

public class Solution {
    public static boolean isAnagram(String s1, String s2) {
        int n = s1.length();
        if (n != s2.length()) return false;
        char[] charsFrequency = new char[26];
        for (int i = 0; i < s1.length(); i++) {
            charsFrequency[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            if(charsFrequency[s2.charAt(i)- 'a'] == 0) return false;
            charsFrequency[s2.charAt(i)- 'a'] --;
        }
       return true;
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

