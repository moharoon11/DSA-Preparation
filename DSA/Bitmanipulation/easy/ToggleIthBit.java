package Bitmanipulation.easy;

public class ToggleIthBit {

    public static void main(String[] args) {
        toggleIthBit(13, 2);
    }

    public static void toggleIthBit(int n, int i) {
        System.out.println(n);
        n = n ^ (1 << i);
        System.out.println(n);
    }
}
