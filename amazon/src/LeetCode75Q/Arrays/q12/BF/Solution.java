package LeetCode75Q.Arrays.q12.BF;

public class Solution {
    public static boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reverse = new StringBuilder(clean).reverse().toString();
        return clean.equals(reverse);
    }
    public static void main(String[] args) {
        {
            String s = "A man, a plan, a canal: Panama";
            boolean output = isPalindrome(s);
            System.out.println("input= "+ s + "\noutput= " + output);
        }
        {
            String s = "race a car";
            boolean output = isPalindrome(s);
            System.out.println("input= "+ s + "\noutput= " + output);
        }
        {
            String s =  " ";
            boolean output = isPalindrome(s);
            System.out.println("input= "+ s + "\noutput= " + output);
        }
    }
}
