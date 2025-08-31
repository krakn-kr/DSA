package LeetCode75Q.TwoPointers.q11.optimalSecond;

import java.util.Arrays;

public class Solution {
    public static int trap(int[] height) {
        int n = height.length;
        if(n<3) return 0;
        int trappedWater = 0;
        int low=0,high = n-1;
        int lefMax=0,rightMax=0;
        while (low<high){
            if(height[low] < height[high]){
                if(height[low]> lefMax){
                    lefMax = height[low];
                }else{
                    trappedWater += lefMax - height[low];
                }
                low++;
            }else{
                if (height[high]>rightMax){
                    rightMax = height[high];
                }else{
                    trappedWater += rightMax - height[high];
                }
                high--;
            }
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
