package Searching.BinarySearch.Easy.coding;

import java.util.Arrays;

// same for finding upper bound also

/**
 * What is Upper Bound?
 * The upper bound algorithm finds the first or the smallest index in a sorted array
 * where the value at that index is greater than the given key i.e. x.
 * The upper bound is the smallest index, ind, where arr[ind] > x.
 *
 * But if any such index is not found, the upper bound algorithm returns n
 * i.e. size of the given array.
 * The main difference between the lower and upper bound is in the condition.
 * For the lower bound the condition was arr[ind] >= x and here,
 * in the case of the upper bound, it is arr[ind] > x.
 */

public class LowerBound {

    public static void main(String[] args) {
        int N = 4, arr[] = {1,2,2,3}, x = 2;
        int N1 = 5, arr1[] = {3,5,8,15,19}, x1 = 9;

        System.out.println("linear search = " + findLowerBound(arr, x, N));
        System.out.println("linear search = " + findLowerBound(arr1, x1, N1));

        System.out.println("Binary search = " + findLowerBoundBs(arr, N, x));
        System.out.println("Binary search = " + findLowerBoundBs(arr1, N1, x1));


    }


    // brute force
    public static int findLowerBound(int[] arr, int x,int n) {


        for(int i=0; i<n; i++) {
            if(arr[i] >= x) {
                return i;
            }
        }

        return -1;
    }

    public static int findLowerBoundBs(int[] arr, int N, int X) {

        int start = 0;
        int end = N - 1;
        int ans = N;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] >= X) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
