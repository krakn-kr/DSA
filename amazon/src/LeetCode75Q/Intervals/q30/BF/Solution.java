package LeetCode75Q.Intervals.q30.BF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<String> summaryRanges(int[] nums) {
        int n= nums.length;
        if(n == 0) return List.of();
        ArrayList<String> result = new ArrayList<>();
        int i=0;
        while (i<n){
            int start = nums[i];
            while (i+1 <n && nums[i+1] - nums[i] == 1){
                i++;
            }
            int end = nums[i];
            if(start == end){
                result.add(String.valueOf(start));
            }else {
                result.add(start+"->"+end);
            }
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        {
            int[] nums = {0,1,2,4,5,7};
            List<String> output = summaryRanges(nums);
            System.out.println("nums: "+"{"+ String.join(", ", Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new)) +"}");
            System.out.println("output: " + output);
        }
        {
            int[] nums = {0,2,3,4,6,8,9};
            List<String> output = summaryRanges(nums);
            System.out.println("nums: "+"{"+ String.join(", ", Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new)) +"}");
            System.out.println("output: " + output);
        }
    }
}
