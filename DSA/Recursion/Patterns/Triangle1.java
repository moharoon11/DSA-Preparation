package Recursion.Patterns;

public class Triangle1 {


    public static void printTraiangle(int row, int col) {
        if(row == 0) return;

        if(col < row) {
            System.out.print("*");
            printTraiangle(row, col + 1);
        } else {
            System.out.println();
            printTraiangle(row - 1, 0);
        }
    }

    public static void main(String[] args) {
        printTraiangle(4,0);
    }
}
