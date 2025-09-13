package LeetCode75Q.HashTable.q28.BF;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1){
            int sum =0;
            int x = n;
            while(x!=0){
                int digit = x % 10;
                sum += digit * digit;
                x = x/10;
            }
            if (set.contains(n)){
                return false;
            }
            set.add(n);
            n = sum;

        }
       return true;
    }
    public static void main(String[] args) {
        {
        /*
        Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

         */
            int n = 19;
            boolean happy = isHappy(n);
            System.out.println("n: " + n);
            System.out.println("output: " + happy);
        }
        {
            int n = 2;
            boolean happy = isHappy(n);
            System.out.println("n: " + n);
            System.out.println("output: " + happy);
        }
    }
}
