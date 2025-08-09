package LeetCode75Q.Arrays.q4.optimal;

import java.util.Arrays;

/*
Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
 */
public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int totalProduct = 1;
        /*
        Input: nums = [1,2,3,4]
                      [1,2,6,24]

        Output: [24,12,8,6]
        Input: nums = [-1,1,0,-3,3]
                      9
        Output: [0,0,9,0,0]
         */
        boolean morezeros = false;
        boolean oneZero = false;
        int count =0;
        for(int i = 0; i < n; i++) {
            if(nums[i]==0) count++;
            else totalProduct*=nums[i];
        }
        if (count>1) morezeros=true;
        if(count==1) oneZero = true;
        int[] result = new int[n];
        if(morezeros){
            Arrays.fill(result,0);
            return result;
        }

        for (int i = 0; i < n; i++) {
            if(oneZero) result[i] = nums[i] !=0? 0: totalProduct;
            else result[i] = nums[i] !=0? totalProduct/nums[i]: totalProduct;
        }
        return result;
    }

    public static void main(String[] args) {
        {
            int[] nums = {1,2,3,4};
            int[] productExceptSelf = productExceptSelf(nums);
            System.out.println("nums= "+ Arrays.toString(nums) + "\noutput = "+Arrays.toString(productExceptSelf));
        }
        {
            int[] nums = {-1,1,0,-3,3};
            int[] productExceptSelf = productExceptSelf(nums);
            System.out.println("nums= "+ Arrays.toString(nums) + "\noutput = "+Arrays.toString(productExceptSelf));
        }
    }
}
