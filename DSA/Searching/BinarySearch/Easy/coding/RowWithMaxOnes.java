package Searching.BinarySearch.Easy.coding;

public class RowWithMaxOnes {

    public static void main(String[] args) {
        int[][] mat = {
                {0, 1, 1},
                {1, 1, 1},
                {0, 0, 0},
        };

        int nrows = mat.length;
        int max = 0;  // Initialize max to 0

        int index = -1;
        for (int i = 0; i < nrows; i++) {
            int ncol = mat[i].length;
            int first = firstOccurrence(mat, i, 0, ncol - 1, 1);
            if (first != -1) {
                int countOnes = ncol - first;
                if (countOnes > max) {
                    max = countOnes;
                    index = i;
                }
            }
        }

        System.out.println(index);
    }

    public static int firstOccurrence(int[][] matrix, int row, int start, int end, int target) {
        int index = -1;

        while (start <= end) {
            int mid = start + ((end - start) >> 1);

            if (matrix[row][mid] == target) {
                index = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
}
