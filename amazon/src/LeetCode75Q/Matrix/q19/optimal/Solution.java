package LeetCode75Q.Matrix.q19.optimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    static class MatrixCoordinate{
        int row;
        int column;

        public MatrixCoordinate(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }
    public static void setZeroes(int[][] matrix) {
        List<MatrixCoordinate> zeroCordinateList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) zeroCordinateList.add(new MatrixCoordinate(i,j));
            }
        }
        for(MatrixCoordinate coordinate: zeroCordinateList){
            for (int i = 0; i < matrix[0].length ; i++) {
                matrix[coordinate.row][i] = 0;
            }
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][coordinate.column] = 0;
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
