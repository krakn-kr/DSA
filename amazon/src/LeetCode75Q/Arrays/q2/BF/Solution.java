package LeetCode75Q.Arrays.q2.BF;

import java.util.Arrays;
/*
Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true



Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n= nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        {
            Solution solution = new Solution();
            int[] nums = {1,2,3,1};
            boolean result = solution.containsDuplicate(nums);
            System.out.println("nums= "+ Arrays.toString(nums)+"\nresult= "+result);
        }
        {
            Solution solution = new Solution();
            int[] nums = {1,2,3,4};
            boolean result = solution.containsDuplicate(nums);
            System.out.println("nums= "+ Arrays.toString(nums)+"\nresult= "+result);
        }
        {
            Solution solution = new Solution();
            int[] nums = {1,1,1,3,3,4,3,2,4,2};
            boolean result = solution.containsDuplicate(nums);
            System.out.println("nums= "+ Arrays.toString(nums)+"\nresult= "+result);
        }

    }
}
