package LeetCode75Q.Arrays.q9.optimal;

import java.util.*;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> hashSet = new HashSet<>();
            for (int j = i+2; j < n; j++) {
                hashSet.add(nums[j-1]);
                List<Integer> tempList = new ArrayList<>();
                int sum = -(nums[i] + nums[j]);
                if (hashSet.contains(sum)){
                   tempList.addAll(List.of(nums[i],nums[j],sum));
                   Collections.sort(tempList);
                   if(!result.contains(tempList)) result.add(tempList);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        {
            int[] nums = {-1,0,1,2,-1,-4};
//            -(i+j) = k
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
    }
}
