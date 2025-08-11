package LeetCode75Q.Arrays.q7.BF;

import java.util.Arrays;

public class Solution {
    public static int findMin(int[] nums) {
        /*
        [4,5,6,7,0,1,2]

        left middle right
        ==============

         */
        int n=nums.length;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minimum = Math.min(nums[i],minimum);
        }
        return minimum;
    }

    public static void main(String[] args) {
        {
           int[] nums = {3,4,5,1,2};
            int min = findMin(nums);
            System.out.println("nums= "+ Arrays.toString(nums)+ "\nmin= "+min);
        }
        {
            int[] nums = {4,5,6,7,0,1,2};
            int min = findMin(nums);
            System.out.println("nums= "+ Arrays.toString(nums)+ "\nmin= "+min);
        }
        {
            int[] nums = {11,13,15,17};
            int min = findMin(nums);
            System.out.println("nums= "+ Arrays.toString(nums)+ "\nmin= "+min);
        }

    }
}
