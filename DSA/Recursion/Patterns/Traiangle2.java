package Recursion.Patterns;

public class Traiangle2 {

    public static void printTraiangle(int row, int col) {
        if(row == 0) return;

        if(col < row) {
            printTraiangle(row, col + 1);
            System.out.print("*");
        } else {
            printTraiangle(row - 1, 0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTraiangle(4,0);
    }
}
