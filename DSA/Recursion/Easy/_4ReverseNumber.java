package Recursion.Easy;

public class _4ReverseNumber {

    public static String reverse1(int n) {
        if(n == 0) return "";
        return (n % 10) + reverse1(n / 10);
    }

    public static int reverse(int n) {
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
        String ans = reverse1(n);
        int num = Integer.parseInt(ans);
        System.out.println(num);
    }
}
