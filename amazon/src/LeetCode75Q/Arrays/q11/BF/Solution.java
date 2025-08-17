package LeetCode75Q.Arrays.q11.BF;

import java.util.Arrays;

public class Solution {
    public static int trap(int[] height) {
        int n = height.length;
        if(n<3) return 0;
        int trappedWater = 0;

        for (int i = 0; i < n; i++) {

            int leftMax = 0;
            for (int j = i; j >=0; j--) {
                leftMax = Math.max(leftMax,height[j]);
            }

            int rightMax = 0;
            for (int j = i; j < n; j++) {
                rightMax = Math.max(rightMax,height[j]);
            }
//            formula trappedWater += min(lm,rm)-h[i]
            trappedWater += (Math.min(leftMax,rightMax) - height[i]);

        }
        return trappedWater;
    }

    public static void main(String[] args) {
        {
            int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
            int output = trap(height);
            System.out.println("height= "+ Arrays.toString(height)+"\noutput= "+output);
        }
        {
            int[] height = {4,2,0,3,2,5};
            int output = trap(height);
            System.out.println("height= "+ Arrays.toString(height)+"\noutput= "+output);
        }
    }
}
