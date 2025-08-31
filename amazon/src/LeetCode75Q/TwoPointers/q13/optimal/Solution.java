package LeetCode75Q.TwoPointers.q13.optimal;

import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        int n= nums.length;
//          [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
//           i, j, k,
//          [0, 1, 0, 1, 1, 2, 2, 3, 3, 4]
//              i, j,     , k
//          [0, 1, 2, 1, 1, 0, 2, 3, 3, 4]
//                 i, j,          k
//          [0, 1, 2, 3, 1, 0, 2, 1, 3, 4,4]
//                    i, j,             k
//          [0, 1, 2, 3, 4, 0, 2, 1, 3, 1,4]
//        1,1,2
//        1,2,1
//          i,j
        int j= 0;
        for (int i = 0; i < n; i++) {
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j +1;
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
