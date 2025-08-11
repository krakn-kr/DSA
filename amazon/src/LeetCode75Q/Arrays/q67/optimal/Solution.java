package LeetCode75Q.Arrays.q67.optimal;

public class Solution {
    public static int climbStairs(int n) {
        if(n<=2) return n;
        int a=2,b=3;
        for (int i = 3; i < n; i++) {
            int nextVal = a + b;
            a= b;
            b=nextVal;
        }
        return b;
    }

    public static void main(String[] args) {
        {
            int n= 2;
            int ouput = climbStairs(n);
            System.out.println("n= "+n+"\nOuput= "+ouput);
        }
        {
            int n= 3;
            int ouput = climbStairs(n);
            System.out.println("n= "+n+"\nOuput= "+ouput);
        }

    }
}
