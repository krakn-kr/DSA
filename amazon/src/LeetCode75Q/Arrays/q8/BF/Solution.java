package LeetCode75Q.Arrays.q8.BF;

import java.util.Arrays;

/*

 */
public class Solution {
    public static int search(int[] nums, int target) {
        int n= nums.length;
        for (int i = 0; i <n ; i++) {
            if(nums[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        {
            int[] nums = {4,5,6,7,0,1,2};
            int  target = 0;
            int output = search(nums, target);
            System.out.println("input= "+Arrays.toString(nums)+"  target = "+target+"\noutput= "+output);
        }
        {
            int[] nums = {4,5,6,7,0,1,2};
            int  target = 3;
            int output = search(nums, target);
            System.out.println("input= "+ Arrays.toString(nums)+"  target = "+target+"\noutput= "+output);
        }
        {
            int[] nums = {1};
            int  target = 0;
            int output = search(nums, target);
            System.out.println("input= "+Arrays.toString(nums)+"  target = "+target+"\noutput= "+output);
        }
    }
}
