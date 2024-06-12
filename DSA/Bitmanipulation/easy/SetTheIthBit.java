package Bitmanipulation.easy;

public class SetTheIthBit {

    public static void main(String[] args) {
        setIthBit(9, 2);
    }

    public static void setIthBit(int n, int i) {
        System.out.println(n);
        n = n | (1 << i);
        System.out.println(n);
    }
}
