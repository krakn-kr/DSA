package LeetCode75Q.Arrays.q1.BF;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/description/
/*
Example 1:
[2,4,5,6,7]
logic building
target = 9
map.put(nums[i],i);
[2,6,11,17,24]
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        for(int i= 0; i<n-1; i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        {
            int[] nums = {2,7,11,15};
            int target = 9;
            int[] result = twoSum(nums,target);
            System.out.println("nums= "+Arrays.toString(nums)+"\ttarget= "+target+"\nresult= "+Arrays.toString(result));
        }
        {
            int[] nums = {3,2,4};
            int target = 6;
            int[] result = twoSum(nums,target);
            System.out.println("nums= "+Arrays.toString(nums)+"\ttarget= "+target+"\nresult= "+Arrays.toString(result));
        }
        {
            int[] nums = {3,3};
            int target = 6;
            int[] result = twoSum(nums,target);
            System.out.println("nums= "+Arrays.toString(nums)+"\ttarget= "+target+"\nresult= "+Arrays.toString(result));
        }
    }
}
