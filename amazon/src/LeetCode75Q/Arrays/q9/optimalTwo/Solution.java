package LeetCode75Q.Arrays.q9.optimalTwo;

import java.util.*;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       int n = nums.length;
       List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n-2; i++) {
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1;
            int k= n-1;
            while (j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                    while (j<k && nums[j] == nums[j+1]) j++;
                    while (j<k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                } else if (sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        {
            int[] nums = {-1,0,1,2,-1,-4};
            var output = threeSum(nums);
            System.out.println("nums= "+ Arrays.toString(nums) + "output= "+output);
        }
        {
            int[] nums = {0,1,1};
            var output = threeSum(nums);
            System.out.println("nums= "+ Arrays.toString(nums) + "output= "+output);
        }
        {
            int[] nums = {0,0,0};
            var output = threeSum(nums);
            System.out.println("nums= "+ Arrays.toString(nums) + "output= "+output);
        }
        {
            int[] nums = {2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10};
            var output = threeSum(nums);
            System.out.println("nums= "+ Arrays.toString(nums) + "output= "+output);

        }
    }
}
