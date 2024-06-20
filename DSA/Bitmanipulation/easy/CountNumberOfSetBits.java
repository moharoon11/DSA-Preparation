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
public class CountNumberOfSetBits {

    public static void main(String[] args) {
        System.out.println(countNumberOfSetBits(13));
        countttt(13);
    }

    public static int countNumberOfSetBits(int n) {
        int count = 0;

        while(n > 0) {
            count += n & 1;
            n = n >> 1;
        }

       // if(n == 1) count++;

        return count;
    }

    public static void countttt(int n) {
        int count = 0;

        while(n > 0) {
            count++;
            n = n >> 1;
        }

        System.out.println("counting = " + count);
    }


    public static int countNumberOfSetBits2(int n) {
        int count = 0;

        while(n != 0) {
            count++;
            n = n & (n - 1);
        }

        return count;
    }
}
