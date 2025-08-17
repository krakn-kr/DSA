package LeetCode75Q.Arrays.q10.optimal;

import java.util.Arrays;

public class Solution {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
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


