package Searching.BinarySearch;

import java.util.Arrays;

// matrix was sorted in rows and column wise manner
public class SortedMatrixRowAndColumnWise {

    public static void main(String... args) {

        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50},
        };

        int target = 37;

        System.out.println(Arrays.toString(search(matrix, target)));

    }

    private static int[] search(int[][] matrix, int target) {


        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c >= 0) {

            if(matrix[r][c] == target) {
                return new int[] {r, c};
            } else if(matrix[r][c] < target) {
                    r++;
            } else {
                c--;
            }

        }

        return new int[] {-1, -1};
    }
    
}
