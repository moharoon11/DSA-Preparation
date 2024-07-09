package Bitmanipulation.easy;

public class ClearIthBit {

    public static void main(String[] args) {
        clearIthBit(13, 2);
    }

    public static void clearIthBit(int n, int i) {
        System.out.println(n);
        n = (n & ~ (1 << i));
        System.out.println(n);
    }
}
