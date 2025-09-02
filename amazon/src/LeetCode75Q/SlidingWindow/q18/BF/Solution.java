package LeetCode75Q.SlidingWindow.q18.BF;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static String minWindow(String s, String t) {
        if(s == null || t == null ||s.length()<t.length()) return "";

        Map<Character,Integer> tFreq =new HashMap<>();
        for(char c:t.toCharArray()){
            tFreq.put(c,tFreq.getOrDefault(c,0)+1);
        }
        int minLen = Integer.MAX_VALUE;
        String result ="";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+t.length(); j <=s.length(); j++) {
                String subStr = s.substring(i,j);
                Map<Character,Integer> subStrFreq = new HashMap<>();
                for (char c: subStr.toCharArray()){
                    subStrFreq.put(c,subStrFreq.getOrDefault(c,0)+1);
                }
                boolean valid = true;
                Set<Map.Entry<Character, Integer>> entries = tFreq.entrySet();
                for (Map.Entry<Character, Integer> entry: entries){
                    char key = entry.getKey();
                    if(subStrFreq.getOrDefault(key,0)< entry.getValue()){
                        valid = false;
                        break;
                    }
                }
                if(valid && subStr.length()<minLen){
                    minLen = subStr.length();
                    result = subStr;
                }
            }
        }
        return minLen == Integer.MAX_VALUE?"":result;
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
