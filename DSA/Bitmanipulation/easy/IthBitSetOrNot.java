package Bitmanipulation.easy;

/**
 * 0: 0000
 * 1: 0001
 * 2: 0010
 * 3: 0011
 * 4: 0100
 * 5: 0101
 * 6: 0110
 * 7: 0111
 * 8: 1000
 * 9: 1001f
 * 10: 1010
 * 11: 1011
 * 12: 1100
 * 13: 1101
 * 14: 1110
 * 15: 1111
 * 16: 10000
 * 17: 10001
 * 18: 10010
 * 19: 10011
 * 20: 10100
 */

public class IthBitSetOrNot {

    private static boolean leftShift(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    private static boolean rightShift(int n, int i) {
        return ((n >> i) & 1) != 0;
    }

}