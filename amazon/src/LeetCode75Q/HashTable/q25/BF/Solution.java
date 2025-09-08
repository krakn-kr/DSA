package LeetCode75Q.HashTable.q25.BF;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        Map<Character,String> sMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            if(sMap.containsKey(currentChar) && !sMap.get(currentChar).equals(words[i])
            || sMap.containsValue(words[i]) && currentChar !=  getKeyFromValue(sMap,words[i])) return false;
            else sMap.put(currentChar,words[i]);
        }
        return true;
    }
    public static Character getKeyFromValue(Map<Character,String> map, String value){
        for (Map.Entry<Character,String> entry: map.entrySet()){
            if(entry.getValue().equals(value)){
                return entry.getKey();
            }
        }
        return 'a';
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
