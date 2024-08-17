package Recursion.Easy;

public class _6CountZeros {

    public static int countZeros(int n) {
        return helper(n, 0);
    }

    public static int helper(int n, int count) {

        if(n == 0) return count;

        if(n % 10 == 0) {
            return helper(n / 10, count+1);
        }
        return helper(n / 10, count);
    }

    public static void main(String[] args) {
        int n = 1004;
        int ans = countZeros(n);
        System.out.println(ans);
    }
}
