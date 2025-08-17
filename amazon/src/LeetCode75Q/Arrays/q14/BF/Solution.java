package LeetCode75Q.Arrays.q14.BF;

import java.util.Arrays;

public class Solution {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int nextNonZeroElement = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i]!=0){
                if(i!=nextNonZeroElement){
                    nums[nextNonZeroElement] = nums[i];
                    nums[i] = 0;
                }
                nextNonZeroElement++;
            }
        }
    }
    public static void main(String[] args) {
        {
            int[] nums = {0,1,0,3,12};
            System.out.println("input = "+ Arrays.toString(nums));
            moveZeroes(nums);
            System.out.println("output= "+ Arrays.toString(nums));
        }
        {
            int[] nums = {0};
            System.out.println("input = "+ Arrays.toString(nums));
            moveZeroes(nums);
            System.out.println("output= "+ Arrays.toString(nums));
        }
    }
}
