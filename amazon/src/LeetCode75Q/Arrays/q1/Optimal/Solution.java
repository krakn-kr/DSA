package LeetCode75Q.Arrays.q1.Optimal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/description/
/*
nums = [2,4,5,6,7] target = 9
logic building
 */
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < n; i++) {
            int requiredValue = target-nums[i];
            if(map.containsKey(requiredValue) && map.get(requiredValue) != i){
                int n1= i;
                int n2 = map.get(requiredValue);
                return new int[] {n1,n2};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        {
            int[] nums = {2,7,11,15};
            int target = 9;
            int[] result = twoSum(nums,target);
            System.out.println("nums= "+ Arrays.toString(nums)+"\ttarget= "+target+"\nresult= "+Arrays.toString(result));
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