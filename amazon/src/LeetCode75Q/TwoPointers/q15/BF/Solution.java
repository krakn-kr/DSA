package LeetCode75Q.TwoPointers.q15.BF;

import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(numbers[i]+numbers[j] == target) return new int[]{i+1,j+1};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        {
            int[] numbers = {2,7,11,15};
            int target = 9;
            int[] output = twoSum(numbers,target);
            System.out.println("numbers= "+ Arrays.toString(numbers) + "\ttarget= "+ target
            +"\noutput= "+Arrays.toString(output));
        }
        {
            int[] numbers = {2,3,4};
            int target = 6;
            int[] output = twoSum(numbers,target);
            System.out.println("numbers= "+ Arrays.toString(numbers) + "\ttarget= "+ target
                    +"\noutput= "+Arrays.toString(output));
        }
        {
            int[] numbers = {-1,0};
            int target = -1;
            int[] output = twoSum(numbers,target);
            System.out.println("numbers= "+ Arrays.toString(numbers) + "\ttarget= "+ target
                    +"\noutput= "+Arrays.toString(output));
        }
    }
}
