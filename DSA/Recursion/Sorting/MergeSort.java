package Recursion.Sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int index = 0;
        int[] sortedArray = new int[left.length + right.length];
        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) sortedArray[index++] = left[i++];
            else sortedArray[index++] = right[j++];
        }
        while(i < left.length) {
            sortedArray[index++] = left[i++];
        }
        while(j < right.length) {
            sortedArray[index++] = right[j++];
        }
        return sortedArray;
    }

    public static int[] mergeSort(int[] arr) {
        if(arr.length == 1) return arr;

        int middle = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, middle));
        int[] right = mergeSort(Arrays.copyOfRange(arr, middle, arr.length));

        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,56,22,33,66,221,1,3,2,44,7,2};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
