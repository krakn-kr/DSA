package LeetCode75Q.Arrays.q6.optimal;

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
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];
        /*
            [2,-5,-2,-4,3]
            [2,-5,20,8,24]
            [2,-10,-2,-80,-240]
         */
        for (int i = 1; i < nums.length; i++) {
            int tempMax = maxSoFar * nums[i];
            int tempMin = minSoFar * nums[i];

            maxSoFar = Math.max(nums[i], Math.max(tempMax, tempMin));
            minSoFar = Math.min(nums[i], Math.min(tempMax, tempMin));

            result = Math.max(result, maxSoFar);
        }
        return result;
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
