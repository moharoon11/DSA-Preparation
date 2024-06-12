package Bitmanipulation.easy;

public class RemoveLastSetBit {

    public static void removeLastSetBit(int n) {
        n = n & (n - 1);
    }
}
