package LeetCode75Q.TwoPointers.q15.optimal;

import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        int i=0,j=n-1;

        while (i<j){
            int currentSum = numbers[i]+numbers[j];
            if(currentSum == target) return new int[]{i+1,j+1};
            else if (currentSum<target) i++;
            else j--;
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