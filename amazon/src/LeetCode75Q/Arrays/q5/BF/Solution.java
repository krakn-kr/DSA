package LeetCode75Q.Arrays.q5.BF;

import java.util.Arrays;

public class Solution {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(nums[i],maxSum);
            sum = nums[i];
            for (int j = i+1; j < n; j++) {
                sum+=nums[j];
                maxSum = Math.max(sum,maxSum);
            }
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