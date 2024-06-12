package Bitmanipulation.easy;

public class IthBitSetOrNot {



    public static boolean leftShift(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    public static boolean rightShift(int n, int i) {
        return ((n >> i) & 1) != 0;
    }

}
