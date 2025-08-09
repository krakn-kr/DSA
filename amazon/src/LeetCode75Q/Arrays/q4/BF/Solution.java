package LeetCode75Q.Arrays.q4.BF;

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
        /*
        Input: nums = [1,2,3,4]
        Output: [24,12,8,6]
         */
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
                result[i] = findProduct(nums,i,n);
        }
        return result;
    }
    public static int findProduct(int[] nums, int index,int n){
        int product = 1;
        for (int i = 0; i < n; i++) {
            if(index !=i) product*=nums[i];
        }
        return product;
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
