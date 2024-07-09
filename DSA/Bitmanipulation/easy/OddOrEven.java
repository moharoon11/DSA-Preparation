package Bitmanipulation.easy;

public class OddOrEven {


    public static void main(String[] args) {

        System.out.println(checkOddOrEven(6));

    }


    public static boolean checkOddOrEven(int n) {
        return (n & 1) == 0;
    }
}
