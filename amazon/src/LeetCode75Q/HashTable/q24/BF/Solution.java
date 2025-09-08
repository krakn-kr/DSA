package LeetCode75Q.HashTable.q24.BF;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> sMap = new HashMap<>();
        Map<Character,Character> tMap = new HashMap<>();
        // If character not seen before, store its
        // first occurrence index
        for (int i = 0; i < s.length(); i++) {
            if(sMap.containsKey(s.charAt(i)) && sMap.get(s.charAt(i)) != t.charAt(i)
            ||tMap.containsKey(t.charAt(i)) && tMap.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }else {
                sMap.put(s.charAt(i),t.charAt(i));
                tMap.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        {
            String s = "privacy", t = "library";
            boolean output = isIsomorphic(s,t);
            System.out.println("s= "+s+"\tt="+t);
            System.out.println(output);
        }
        {
            String s = "egg", t = "add";
            boolean output = isIsomorphic(s,t);
            System.out.println("s= "+s+"\tt="+t);
            System.out.println(output);
        }
        {
            String s = "foo", t = "bar";
            boolean output = isIsomorphic(s,t);
            System.out.println("s= "+s+"\tt="+t);
            System.out.println(output);
        }
        {
            String s = "paper", t = "title";
            boolean output = isIsomorphic(s,t);
            System.out.println("s= "+s+"\tt="+t);
            System.out.println(output);
        }

    }
}
