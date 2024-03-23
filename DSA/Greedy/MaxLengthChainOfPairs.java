package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs {

    public static void main(String... args) {
        int[][] pairs = {{5,24}, {39,60}, {5,28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparingDouble(O -> O[1]));

        int lastSelected = pairs[0][1];
        int maxPairCount = 1;

        for(int i=1; i<pairs.length; i++) {
            if(pairs[i][0] > lastSelected) {
                maxPairCount++;
                lastSelected = pairs[i][1];
            }
        }

        System.out.println("Maximum chain of pairs are " + maxPairCount);
    }
}
