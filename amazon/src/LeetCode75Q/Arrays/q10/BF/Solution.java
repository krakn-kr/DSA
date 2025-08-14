package LeetCode75Q.Arrays.q10.BF;

import java.util.Arrays;

public class Solution {
    public static int maxArea(int[] height) {
        int n = height.length;
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
//              height = [1,8,6,2,5,4,8,3,7]
               int min = Math.max(height[i],height[j]);
                int tempMax = min * i;
                maximum = Math.max(maximum,tempMax);
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        {
            int[] height = {1,8,6,2,5,4,8,3,7};
            int output = maxArea(height);
            System.out.println("height= "+ Arrays.toString(height) + "\noutput= "+ output);
        }
        {
            int[] height = {1,1};
            int output = maxArea(height);
            System.out.println("height= "+ Arrays.toString(height) + "\noutput= "+ output);
        }

    }
}
