package Recursion.Backtracking;

public class Maze {


    public static int count(int row, int col) {
        if(row == 1 || col == 1) {
            return 1;
        }

        int left = count(row-1, col);
        int right = count(row, col - 1);
        return left + right;
    }

    public static void printPaths(String p, int row, int col) {
        if(row == 1&& col == 1) {
            System.out.println(p);
            return;
        }

        if(row > 1) {
            printPaths(p + "D", row - 1, col);
        }

        if(col > 1) {
            printPaths(p + "R", row, col - 1);
        }

    }

    public static void printPathDiagonal(String p, int row, int col) {
        if(row == 1&& col == 1) {
            System.out.println(p);
            return;
        }


        if(row > 1) {
            printPathDiagonal(p + "V", row - 1, col);
        }

        if(col > 1) {
            printPathDiagonal(p + "H", row, col - 1);
        }

        if(row > 1 && col > 1) {
            printPathDiagonal(p + "D", row - 1, col -1);
        }
    }

    public static void pathRestrictions(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[row][col]) return;



        if(row < maze.length - 1) {
            pathRestrictions(p + "D", maze, row + 1, col);
        }

        if(col < maze[0].length - 1) {
            pathRestrictions(p + "R", maze, row, col + 1);
        }


    }

    public static void allPath(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[row][col]) return;

        maze[row][col] = false;

        if(row < maze.length - 1) {
            allPath(p + "D", maze, row + 1, col);
        }

        if(col < maze[0].length - 1) {
            allPath(p + "R", maze, row, col + 1);
        }

        if(row > 0) {
            allPath(p + "D", maze, row - 1, col);
        }

        if(col > 0) {
            allPath(p + "R", maze, row, col - 1);
        }

        maze[row][col] = true;
    }

    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        allPath("", maze, 0, 0);
    }

}
