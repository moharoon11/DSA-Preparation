package Searching.BinarySearch.Easy.Looking;

import java.util.Arrays;

public class FairCandySwap {

    public static void main(String[] args) {

        int[] aliceSizes = {};
        int[] bobSizes = {};
        int [] result = candySwapBinarySearch(aliceSizes, bobSizes);
        System.out.println(result);

    }

    // brute force method
    static int[] candySwap(int[] aliceSizes, int[] bobSizes) {
        
        int aliceTotoal = 0;
        int bobTotal = 0;
        for(int num : aliceSizes) aliceTotoal += num;
        for(int num : bobSizes) bobTotal += num;

        for(int i=0; i<aliceSizes.length; i++) {
            for(int j=0; j<bobSizes.length; j++) {
                if((aliceTotoal - aliceSizes[i] + bobSizes[j]) == (bobTotal - bobSizes[j] + aliceSizes[i])) {
                    return new int[] {aliceSizes[i], bobSizes[j]};
                }
            }
        }

        return new int[0];
    }


    static int[] candySwapBinarySearch(int[] aliceSizes, int[] bobSizes) {


        int aliceTotoal = 0;
        int bobTotal = 0;
        for(int num : aliceSizes) aliceTotoal += num;
        for(int num : bobSizes) bobTotal += num;

        Arrays.sort(bobSizes);

        for(int i=0; i<aliceSizes.length; i++) {

            int target = (bobTotal - aliceTotoal + 2 * aliceSizes[i]) / 2;
            if(binarySearch(bobSizes, target)) {
                return new int[]{aliceSizes[i], target};
            }
        }

        return new int[0];
    }

    private static boolean binarySearch(int[] bobSizes, int target) {

        int start = 0;
        int end = bobSizes.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;
            if(target > bobSizes[mid]) {
                start = mid + 1;
            } else if(target < bobSizes[mid]) {
                end =  mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
    
}
