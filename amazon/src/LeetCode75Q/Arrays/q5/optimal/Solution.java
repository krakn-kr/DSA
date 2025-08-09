package LeetCode75Q.Arrays.q5.optimal;

import java.util.Arrays;

public class Solution {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            maxSum = Math.max(sum,maxSum);
            if(sum<0) sum =0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        {
            int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
            int output = maxSubArray(nums);
            System.out.println("nums= "+ Arrays.toString(nums)+"\nOutput= "+output);
        }
        {
            int[] nums = {1};
            int output = maxSubArray(nums);
            System.out.println("nums= "+ Arrays.toString(nums)+"\nOutput= "+output);
        }
        {
            int[] nums = {5,4,-1,7,8};
            int output = maxSubArray(nums);
            System.out.println("nums= "+ Arrays.toString(nums)+"\nOutput= "+output);
        }
    }
}