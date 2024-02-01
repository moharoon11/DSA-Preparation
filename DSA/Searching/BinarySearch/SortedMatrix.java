package Searching.BinarySearch;

import java.util.Arrays;

public class SortedMatrix {


    public static void main(String... args) {

        int[][] matrix = {
               {1,2,3,4},
               {5,6,7,8},
               {9,10,11,12},
        };

        int target = 3;

        searchMatrix(matrix, target);
       
    }


    private static void searchMatrix(int[][] matrix, int target) {
        int rowId = searchFowPotentialRow(matrix, target);

      

        if(rowId != -1) 
           System.out.println(Arrays.toString(binarySearchOverRow(matrix, rowId, target)));
        else
          System.out.println(-1);

    }

    private static int searchFowPotentialRow(int[][] matrix, int target) {
 
        int start = 0;
        int end = matrix.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(matrix[mid][0] <= target && matrix[mid][matrix[mid].length - 1] >= target) {
                return mid;
            } else if(matrix[mid][0] < target) {
                 start = mid + 1;
            } else {
                 end = mid -1;
            }
        }
        
        return -1;
    }

    private static int[] binarySearchOverRow(int[][] matrix, int rowId, int target) {

        int start = 0;
        int end = matrix[rowId].length -  1;

        while(start <= end) {

            int mid  = start + (end - start) / 2;

            if(target == matrix[rowId][mid]) {
              return new int[] {rowId, mid};
            } else if(target > matrix[rowId][mid]) {
                  start = mid + 1;
            } else {
                  end = mid - 1;
            }
        }

        return new int[] {-1, -1};
    }

}
