package LeetCode75Q.HashTable.q27.BF;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length == 1) {
            List<String> single = new ArrayList<>();
            single.add(strs[0]);
            result.add(single);
            return result;
        }
        int[] tracker = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            boolean flag = false;
            for (int j = i+1; j < strs.length; j++) {
                if (isAnagram(strs[i], strs[j])) {
                    flag = true;
                    int  index = findAnagramGroup(result, strs[i]);
                    if (index != -1) {
                        if (!result.get(index).contains(strs[j])) {
                                result.get(index).add(strs[j]);
                                tracker[j] = 1;
                        }else {
                            if(tracker[j] == 0) {
                                result.get(index).add(strs[j]);
                                tracker[j] = 1;
                            }
                        }
                    } else {
                        List<String> newAnagramGroup = new ArrayList<>();
                        newAnagramGroup.add(strs[i]);
                        newAnagramGroup.add(strs[j]);
                        result.add(newAnagramGroup);
                        tracker[i] = 1;
                        tracker[j] = 1;
                    }
                }
            }
            if(!flag) {
                int  index = findAnagramGroup(result, strs[i]);
                if (index == -1) {
                    List<String> single = new ArrayList<>();
                    single.add(strs[i]);
                    result.add(single);
                }
            }
        }
        return result;
    }
    public static int findAnagramGroup(List<List<String>> result, String str) {
        int index = 0;
        for (List<String> group : result) {
            if (group.contains(str)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    public static boolean isAnagram(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n != m) return false;
        if(n==0) return true;
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
//        {
//            String[] strs = {"eat","tea","tan","ate","nat","bat"};
//            List<List<String>> groupAnagrams = groupAnagrams(strs);
//            System.out.println("strs: {" + String.join(", ", strs)+"}");
//            System.out.println("output: " + groupAnagrams);
//        }
//        {
//            String[] strs = {""};
//            List<List<String>> groupAnagrams = groupAnagrams(strs);
//            System.out.println("strs: {" + String.join(", ", strs)+"}");
//            System.out.println("output: " + groupAnagrams);
//        }
//        {
//            String[] strs = {"a"};
//            List<List<String>> groupAnagrams = groupAnagrams(strs);
//            System.out.println("strs: {" + String.join(", ", strs)+"}");
//            System.out.println("output: " + groupAnagrams);
//        }
        {
            String[] strs = {"","",""};
            List<List<String>> groupAnagrams = groupAnagrams(strs);
            System.out.println("strs: {" + String.join(", ", strs)+"}");
            System.out.println("output: " + groupAnagrams);
        }
    }
}
