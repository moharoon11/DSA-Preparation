package Greedy;

import java.util.Arrays;

public class MinAbsoluteDifferentPairs {

    public static void main(String... args) {

        int[] a = {1, 2, 3};
        int[] b = {2, 1, 3};

        Arrays.sort(a);
        Arrays.sort(b);

        int minSum = 0;
        for(int i=0; i<a.length; i++) {
            minSum += Math.abs(a[i] - b[i]);
        }

        System.out.println("Minimum Absolute Difference is = " + minSum);
    }

}
