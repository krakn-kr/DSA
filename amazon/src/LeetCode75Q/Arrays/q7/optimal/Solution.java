package LeetCode75Q.Arrays.q7.optimal;

import java.util.Arrays;

public class Solution {
    public static int findMin(int[] nums) {
        /*
        [4,5,6,7,0,1,2]

         */
        int l=0,r=nums.length-1;
        while (l<r){
            int mid = l+(r-l)/2;
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        {
            int[] nums = {3,4,5,1,2};
            int min = findMin(nums);
            System.out.println("nums= "+ Arrays.toString(nums)+ "\nmin= "+min);
        }
        {
            int[] nums = {4,5,6,7,0,1,2};
            int min = findMin(nums);
            System.out.println("nums= "+ Arrays.toString(nums)+ "\nmin= "+min);
        }
        {
            int[] nums = {11,13,15,17};
            int min = findMin(nums);
            System.out.println("nums= "+ Arrays.toString(nums)+ "\nmin= "+min);
        }

    }
}
