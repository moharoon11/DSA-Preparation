package Bitmanipulation.easy;

public class CheckNumberPowerOf2 {

    private static boolean isPowerOf2(int n) {
        return (n & (n - 1)) == 0;
    }
}

