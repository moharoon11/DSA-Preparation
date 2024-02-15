package Sorting;

import java.util.Arrays;

/*
 * 1. we divide the array by 2 
 * 2. then we take left side and try to sort it
 * 3. then we take right side and try to sort it
 * 4. once both of them are sorted we just merge both the array on some specific condition
 * 5. but once we divide the array we get left parts and right parts
 * 6. for both the left parts and right parts the above 5 points will be happening again
 * 7. it will happen untill there is only one element in an array 
 * 8. if array contains only one element the array itself is sorted we simply return it
 * 9. this would be our base condition for recursive approach
 * 10. once we get the element from left and right we merge and return to the caller
 * 11. untill it reaches the last caller
 */
public class MergeSort {


    public static void main(String... args) {

        int[] arr={5,4,3,2,1};

        int[]ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] mergeSort(int[] arr) {

        if(arr.length == 1) {
            return arr;
        }

        int low = 0;
        int high = arr.length;
        int mid = arr.length / 2;

        int left[] = mergeSort(Arrays.copyOfRange(arr, low, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, high));
        
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {

        int[] mergedSortedArray = new int[left.length + right.length];

        int li = 0;
        int ri = 0;
        int ki = 0;

        while(li < left.length && ri < right.length) {

            if(left[li] < right[li]) {
                 mergedSortedArray[ki] = left[li];
                 li++;
            } else {
                 mergedSortedArray[ki] = right[ri];
                 ri++;
            }
            ki++;
        }

        while(li < left.length) {
            mergedSortedArray[ki++] = left[li++];
        }

        while(ri < right.length) {
            mergedSortedArray[ki++] = right[ri++];
        }

        return mergedSortedArray;
    }
    
}
