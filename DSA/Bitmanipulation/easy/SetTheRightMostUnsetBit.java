package Bitmanipulation.easy;

public class SetTheRightMostUnsetBit {

    public static int doIt(int n) {
        return n | (n + 1);
    }
}
