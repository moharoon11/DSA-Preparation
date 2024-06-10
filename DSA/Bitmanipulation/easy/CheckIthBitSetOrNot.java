package Bitmanipulation.easy;

public class CheckIthBitSetOrNot {

    public static void main(String[] args) {
        System.out.println(check(13, 2));
    }

    public static boolean check(int n, int i) {
        return (n & (i << i)) != 0;
    }
}
