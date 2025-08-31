package LeetCode75Q.TwoPointers.q14.optimal;

import java.util.Arrays;

public class Solution {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int j=0,k=0;
        while (j<n) {
            while (j<n && nums[j]!=0)j++;
            k= j+1;
            while (k<n && nums[k] == 0) k++;

            if(k<n){
                nums[j] = nums[k];
                nums[k] = 0;
            }else break;
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

