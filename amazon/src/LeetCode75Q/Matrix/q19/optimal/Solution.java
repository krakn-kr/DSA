package LeetCode75Q.Matrix.q19.optimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    for (int k = 0; k < matrix[0].length ; k++) {
                        if(matrix[i][k] != 0) matrix[i][k] = -10;
                    }
                    for (int k = 0; k < matrix.length ; k++) {
                        if(matrix[k][j] != 0) matrix[k][j] = -10;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -10) matrix[i][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        {
            int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
            System.out.println(Arrays.deepToString(matrix));
            setZeroes(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
            System.out.println(Arrays.deepToString(matrix));
            setZeroes(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
    }
}
