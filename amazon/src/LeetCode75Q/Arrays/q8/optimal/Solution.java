package LeetCode75Q.Arrays.q8.optimal;

import java.util.Arrays;

public class Solution {
    public static int search(int[] nums, int target) {
        int n= nums.length;
        int left = 0, right = n-1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target) return mid;
            if(nums[left]<= nums[mid]){
                if(nums[left]<=target && target < nums[mid]) right = mid -1;
                else left = mid +1;
            }else{
                if (nums[mid]<target && target <= nums[right]) left = mid+1;
                else right = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        {
            int[] nums = {4,5,6,7,0,1,2};
            int  target = 0;
            int output = search(nums, target);
            System.out.println("input= "+ Arrays.toString(nums)+"  target = "+target+"\noutput= "+output);
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
        {
            int[] nums = {1,3};
            int  target = 3;
            int output = search(nums, target);
            System.out.println("input= "+Arrays.toString(nums)+"  target = "+target+"\noutput= "+output);
        }
        {
            int[] nums = {3,5,1};
            int  target = 3;
            int output = search(nums, target);
            System.out.println("input= "+Arrays.toString(nums)+"  target = "+target+"\noutput= "+output);
        }
        {
            int[] nums = {5,1,3};
            int  target = 3;
            int output = search(nums, target);
            System.out.println("input= "+Arrays.toString(nums)+"  target = "+target+"\noutput= "+output);
        }
        {
            int[] nums = {5,1,3};
            int  target = 5;
            int output = search(nums, target);
            System.out.println("input= "+Arrays.toString(nums)+"  target = "+target+"\noutput= "+output);
        }
        {
            int[] nums = {4,5,6,7,8,1,2,3};
            int  target = 8;
            int output = search(nums, target);
            System.out.println("input= "+Arrays.toString(nums)+"  target = "+target+"\noutput= "+output);
        }

    }
}
