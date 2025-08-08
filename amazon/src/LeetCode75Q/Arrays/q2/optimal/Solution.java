package LeetCode75Q.Arrays.q2.optimal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(!set.contains(nums[i])) set.add(nums[i]);
            else return true;
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
