package Searching.BinarySearch.Easy.coding;

import java.util.Arrays;

public class UpperBound {

    public static void main(String[] args) {
        int N = 4, arr[] = {1,2,2,3}, x = 2;
        int N1 = 5, arr1[] = {3,5,8,15,19}, x1 = 9;

        System.out.println("linear search = " + findUpperBound(arr, x, N));
        System.out.println("linear search = " + findUpperBound(arr1, x1, N1));

        System.out.println("Binary search = " + findUpperBoundBs(arr, N, x));
        System.out.println("Binary search = " + findUpperBoundBs(arr1, N1, x1));


    }


    // brute force
    public static int findUpperBound(int[] arr, int x,int n) {


        for(int i=0; i<n; i++) {
            if(arr[i] > x) {
                return i;
            }
        }

        return -1;
    }

    public static int findUpperBoundBs(int[] arr, int N, int X) {

        int start = 0;
        int end = N - 1;
        int ans = N;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > X) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
