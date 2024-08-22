package Recursion.Backtracking;

public class NQueens {

    public static void main(String[] args) {
        boolean[][] board = {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}
        };

        int n = board.length;

        System.out.println("Total number of possiblities we can place N queens on board is = " + queens(board, 0));
    }

    public static int queens(boolean[][] board, int row) {

        if(row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        // place the queens at every row and col
        for(int col = 0; col<board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {

        // vertical row
        for(int i=0; i < row; i++) {
            if(board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for(int i=1; i<=maxLeft; i++) {
            if(board[row-1][col-1]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for(int i=1; i<= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

    public static void display(boolean[][] board) {
        for(boolean[] row: board) {
            for(boolean element: row) {
                if(element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
