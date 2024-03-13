package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {

    public static void main(String... args) {

        System.out.println(count(3,3));
        System.out.println(path("", 3,3));
        System.out.println(pathDiagonal("", 3,3));

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

     pathRestriction("", maze, 0, 0);
    }

    private static int count(int row, int col) {

        if(row == 1 || col == 1) return 1;

        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }

    private static List<String> path(String p, int row, int col) {

        List<String> paths = new ArrayList<String>();

        if(row == 1 && col == 1) {
            paths.add(p);
            return paths;
        }

        if(row > 1) {
            paths.addAll(path(p + "D", row - 1, col));
        }

        if(col > 1) {
            paths.addAll(path(p + "R", row, col - 1));
        }

        return paths;
    }

    private static List<String> pathDiagonal(String p, int row, int col) {

        List<String> paths = new ArrayList<String>();

        if(row == 1 && col == 1) {
            paths.add(p);
            return paths;
        }

        if(row > 1 && col > 1) {
            paths.addAll(path(p + "VH", row - 1, col-1));
        }

        if(row > 1) {
            paths.addAll(path(p + "D", row - 1, col));
        }

        if(col > 1) {
            paths.addAll(path(p + "R", row, col - 1));
        }

        return paths;
    }

    private static void pathRestriction(String p, boolean[][] maze, int row, int col) {

        if(row == maze.length -1 && col == maze[0].length -1) {
            System.out.println(p);
            return;
        }

        if(!maze[row][col]) return;

        if(row < maze.length - 1) {
            pathRestriction(p + "D", maze,row + 1, col);
        }

        if(col < maze[0].length - 1) {
            pathRestriction(p + "R", maze,row, col + 1);
        }

    }

}
