package LeetCode75Q.TwoPointers.q11.optimal;

import java.util.Arrays;

public class Solution {
    public static int trap(int[] height) {
        int n = height.length;
        if(n<3) return 0;
        int trappedWater = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        for (int i = n-2; i >=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
        for (int i = 0; i < n-1; i++) {
//            formula trappedWater += min(lm,rm)-h[i]
            trappedWater += (Math.min(leftMax[i],rightMax[i]) - height[i]);

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
