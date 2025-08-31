package LeetCode75Q.TwoPointers.q13.BF;

import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        int[] array = Arrays.stream(nums).distinct().toArray();
        for (int i = 0; i < array.length; i++) {
            nums[i] = array[i];
        }
        return array.length;
    }
    public static void main(String[] args) {
        {
            int[] nums = {1,1,2};
            int output = removeDuplicates(nums);
            System.out.println("input=  "+ Arrays.toString(nums) + "\noutput= "+ output);
        }
        {
            int[] nums = {0,0,1,1,1,2,2,3,3,4};
            int output = removeDuplicates(nums);
            System.out.println("input=  "+ Arrays.toString(nums) + "\noutput= "+ output);
        }
    }
}
