package LeetCode75Q.Matrix.q20.BF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length,n= matrix[0].length;
        int total = m*n;
        int k= 0;
        List<Integer> result = new ArrayList<>();
        while (total>0){
            for (int i = k; i <= n-1-k ; i++) {
                if(total>0)result.add(matrix[k][i]);
                total--;
            }
            for (int i = k+1; i <= m-1-k ; i++) {
                if(total>0)result.add(matrix[i][n-1-k]);
                total--;
            }
            for (int i = n-2-k; i >= k; i--) {
                if(total>0)result.add(matrix[m-1-k][i]);
                total--;
            }
            for (int i = m-2-k; i >k; i--) {
                if(total>0)result.add(matrix[i][k]);
                total--;
            }
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        {
            int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
            List<Integer> output = spiralOrder(matrix);
            System.out.println("Input=  "+Arrays.deepToString(matrix));
            System.out.println("Output= "+ output );
        }
        {
            int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
            List<Integer> output = spiralOrder(matrix);
            System.out.println("Input=  "+Arrays.deepToString(matrix));
            System.out.println("Output= "+ output );
        }
    }
}
