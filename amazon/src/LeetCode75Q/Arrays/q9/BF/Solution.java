package LeetCode75Q.Arrays.q9.BF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
            int n= nums.length;
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    for (int k = j+1; k <n ; k++) {
                        List<Integer> tempList = new ArrayList<>();
                        int sum = nums[i] + nums[j] + nums[k];
                        if (sum == 0){
                            tempList.addAll(List.of(nums[i],nums[j],nums[k]));
                            Collections.sort(tempList);
                            if(!result.contains(tempList)) result.add(tempList);
                        }
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
    }
}
