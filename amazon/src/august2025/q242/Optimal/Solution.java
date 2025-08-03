package august2025.q242.Optimal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        boolean result = isAnagram(s, t);
        System.out.println("Anagrams:"+result);
    }
    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap();
        for(int i= 0;i<s.length();i++){
            map.compute(s.charAt(i),(key,val)-> (val==null)?1:val+1);
        }
        for (int i = 0; i < t.length(); i++) {
            map.compute(t.charAt(i),(key,val)-> (val==null)?Integer.MIN_VALUE:val-1);
        }
        long count = map.values().stream().filter(val->val!=0).count();
        System.out.println(map+" "+count);
        return count == 0?true:false;
    }
}
