package LeetCode75Q.Arrays.q1.BF.second;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], Arrays.asList(map.get(nums[i]).get(0),i));
            }else{
                map.put(nums[i],Arrays.asList(i));
            }
        }
        Arrays.sort(nums);
        /*
        int[] nums = {2,3,5,7,11,15,};
            int target = 14;
         */
        int i=0,j=1;
        for (; i < n; ) {
            int expected = nums[i]+nums[j];
            if(expected == target){
                if (nums[i] != nums[j]){
                    return new int[] {map.get(nums[i]).get(0),map.get(nums[j]).get(0)};
                }else {
                    return new int[] {map.get(nums[i]).get(0),map.get(nums[j]).get(1)};
                }
            }
            else {
                while (expected < target && j<n && i< n-1){
                    expected = nums[i]+nums[j];
                    if (j<n-1) j++;
                }

                if(expected != target && j>0 && i<n-1){ j--; i++;}
            }
        }
        return null;
    }
}