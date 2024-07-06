package Arrays;

public class PascalTriangle {

    public static void main(String[] args) {
        int row = 5;
        int col = 3;
        System.out.println("Element at row " + row + " and col " + col + " is = " +
                NcR(row - 1, col - 1));
        // Print the nth row
        int n = 5;
        for(int c=1; c<=5; c++) {
            System.out.print(NcR(n - 1, c - 1) + " ");
        }
        System.out.println("\n");
        //Print nth row optimal solution
        int rowToPrint = 5;
        int ans = 1;
        System.out.print(ans + " ");
        for (int i = 1; i < rowToPrint; i++) {
            ans = ans * (rowToPrint - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    public static long NcR(int row, int col) {
        long ans = 1;
        for(int i=0; i<col; i++) {
            ans *= row - i;
            ans /= i + 1;
        }
        return ans;
    }


}
