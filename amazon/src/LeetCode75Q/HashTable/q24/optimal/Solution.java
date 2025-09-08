package LeetCode75Q.HashTable.q24.optimal;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isIsomorphic(String s, String t) {

        Map<Character,Character> characterMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if(!characterMap.containsKey(original)){
                if(!characterMap.containsValue(replacement)){
                    characterMap.put(original,replacement);
                }else return false;
            }else{
                char mappedCharacter = characterMap.get(original);
                if(mappedCharacter != replacement) return false;
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
