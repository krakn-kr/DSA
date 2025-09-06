package LeetCode75Q.Matrix.q21.BF;

import java.util.Arrays;

public class Solution {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        {
            int[][]  matrix = {{1,2,3},{4,5,6},{7,8,9}};
            System.out.println("Input=  "+Arrays.deepToString(matrix));
            rotate(matrix);
            System.out.println("Output= "+Arrays.deepToString(matrix));
        }
        {
            int[][]  matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
            System.out.println("Input=  "+Arrays.deepToString(matrix));
            rotate(matrix);
            System.out.println("Output= "+Arrays.deepToString(matrix));
        }
    }
}
