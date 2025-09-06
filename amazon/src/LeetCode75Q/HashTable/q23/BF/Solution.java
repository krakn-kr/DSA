package LeetCode75Q.HashTable.q23.BF;

public class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] charFrequency = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            charFrequency[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(charFrequency[ransomNote.charAt(i)-'a']>0){
                charFrequency[ransomNote.charAt(i)-'a']--;
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        {
//            String ransomNote = "a", magazine = "bbbbbbb";
            String ransomNote = "a", magazine = "b";
            boolean output = canConstruct(ransomNote, magazine);
            System.out.println("ransomNote: "+ransomNote+"magazine: "+magazine);
            System.out.println("Output=  "+ output);
        }
        {
            String ransomNote = "aa", magazine = "ab";
            boolean output = canConstruct(ransomNote, magazine);
            System.out.println("ransomNote: "+ransomNote+"magazine: "+magazine);
            System.out.println("Output=  "+ output);
        }
        {
            String ransomNote = "aa", magazine = "aab";
            boolean output = canConstruct(ransomNote, magazine);
            System.out.println("ransomNote: "+ransomNote+"magazine: "+magazine);
            System.out.println("Output=  "+ output);
        }
    }
}
