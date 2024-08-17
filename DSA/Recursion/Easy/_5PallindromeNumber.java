package Recursion.Easy;

public class _5PallindromeNumber {

    public static boolean isPal(int n) {
        return (n == reverse(n));
    }

    public static int reverse(int n) {

        // sometime if we need an extra argument we can use helper functions
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    public static int helper(int n, int digits) {
        if(n % 10 == n) return n;
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits -1) + helper(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        int n = 1234;
        int n1 = 1234321;
        System.out.println(isPal(n));
        System.out.println(isPal(n1));
    }
}
