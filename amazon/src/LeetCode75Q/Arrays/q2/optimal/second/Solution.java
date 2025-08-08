package LeetCode75Q.Arrays.q2.optimal.second;

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i=0,j=1;
        for (; i < n-1; i++,j++) {
            if(nums[i] == nums[j]) return true;
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