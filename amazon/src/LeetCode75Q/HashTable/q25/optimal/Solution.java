package LeetCode75Q.HashTable.q25.optimal;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        Map<Character,String> pMap = new HashMap<>();
        Map<String,Character> sMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            if(pMap.containsKey(currentChar) && !pMap.get(currentChar).equals(words[i])
                    || pMap.containsValue(words[i]) && currentChar != sMap.get(words[i])) return false;
            else pMap.put(currentChar,words[i]); sMap.put(words[i],currentChar);
        }
        return true;
    }
    public static void main(String[] args) {
        {
            String pattern = "abba", s = "dog cat cat dog";
            boolean output = wordPattern(pattern, s);
            System.out.println("pattern= " + pattern + "\ts=" + s);
            System.out.println(output);
        }
        {
            String pattern = "abba", s = "dog cat cat fish";
            boolean output = wordPattern(pattern, s);
            System.out.println("pattern= " + pattern + "\ts=" + s);
            System.out.println(output);

        }
        {
            String pattern = "aaaa", s = "dog cat cat dog";
            boolean output = wordPattern(pattern, s);
            System.out.println("pattern= " + pattern + "\ts=" + s);
            System.out.println(output);
        }
    }
}
