package LeetCode75Q.Arrays.q12.optimal;

public class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i=0, j= s.length()-1;
        while (i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
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
