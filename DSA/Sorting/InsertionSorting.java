package Sorting;

import java.util.Arrays;

public class InsertionSorting {
    
    
    public static void main(String... args) {

        int[] arr = {-33, 3, -54, -90, -1, 0, 0,5,4,1,2};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {

        for(int i=0; i<=arr.length-2; i++) {

            for(int j=i+1; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
