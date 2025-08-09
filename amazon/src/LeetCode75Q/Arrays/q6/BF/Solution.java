package LeetCode75Q.Arrays.q6.BF;

import java.util.Arrays;

/*
Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */
public class Solution {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        /*
        Input: nums = [2,3,-2,4]

        Output: 6
         */
        int maxProduct = Integer.MIN_VALUE;
        int product;
        for (int i = 0; i < n; i++) {
            product = nums[i];
            maxProduct = Math.max(product,maxProduct);
            for (int j = i+1; j <n ; j++) {
                product *=nums[j];
                maxProduct = Math.max(product,maxProduct);
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        {
            {
                int[] nums = {2,3,-2,4};
                int output = maxProduct(nums);
                System.out.println("nums= "+ Arrays.toString(nums)+"\nOutput= "+output);
            }
            {
                int[] nums = {-2,0,-1};
                int output = maxProduct(nums);
                System.out.println("nums= "+ Arrays.toString(nums)+"\nOutput= "+output);
            }

        }
    }
}