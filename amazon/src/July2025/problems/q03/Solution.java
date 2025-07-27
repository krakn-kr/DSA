/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/1713165221/
 */
package July2025.problems.q03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println(result);
        s = "bbbbb";
        result = solution.lengthOfLongestSubstring(s);
        System.out.println(result);
        s = "pwwkew";
        result = solution.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (charIndexMap.containsKey(currentChar)) {
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }
            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public int lengthOfLongestSubstringtest(String s) {
        Set<Character> visited = new HashSet<>();
        char[] charArray = s.toCharArray();
        int longest = 0;
        int count = 0;
        for(int i= 0; i<charArray.length; i++){
            var currentChar = charArray[i];
            if(!visited.contains(currentChar)){
                visited.add(currentChar);
                count++;
                if(count>longest){
                    longest = count;
                }
            }else {
                visited.clear();
                count = 0;
            }
        }
        return longest;
    }
}
