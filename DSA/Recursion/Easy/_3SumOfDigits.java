package Recursion.Easy;

public class _3SumOfDigits {

    public static int sumOfDigits(int n) {
        if(n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        int n = 1342;
        int ans = sumOfDigits(n);
        System.out.println(ans);
    }
}
