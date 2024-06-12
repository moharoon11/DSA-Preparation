package Bitmanipulation.easy;

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
