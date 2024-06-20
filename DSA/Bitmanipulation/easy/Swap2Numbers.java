package Bitmanipulation.easy;

public class Swap2Numbers {

    public static void main(String[] args) {
        //swapNormal(9, 5);
        swapWithXor(9, 5);
        //swapWithXor(5, 5);
    }


    public static void swapWithXor(int a, int b) {
        System.out.println("Before swapping");
        System.out.println("a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping");
        System.out.println("a = " + a + ", b = " + b);
    }
    public static void swapNormal(int a, int b) {
        System.out.println("Before swapping");
        System.out.println("a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping");
        System.out.println("a = " + a + ", b = " + b);
    }
}
