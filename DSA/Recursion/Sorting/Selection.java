package Recursion.Sorting;

import java.util.Arrays;

public class Selection {

    // max is an variable that contains the index position of maximum in an array
    public static void selection(int[] arr, int length, int index, int max) {

        if(length == 0) return;

        if(index < length) {
            if(arr[index] > arr[max]) {
                selection(arr, length, index + 1, index);
            } else {
                selection(arr, length, index + 1, max);
            }
        } else {
            int temp = arr[length - 1];
            arr[length - 1] = arr[max];
            arr[max] = temp;
            selection(arr, length -1, 0, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
