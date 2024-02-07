package Sorting;
import java.util.Arrays;


public class SelectionSort {

    public static void main(String... args) {

        int[] arr = {0,4, 5, 1, 2, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr) {

        for(int i=0; i<arr.length; i++) {

             int last = arr.length -i -1;
             int max = getMaxIndex(arr, 0, last);
             swap(arr, max, last);
        }

    }


    private static int getMaxIndex(int[] arr, int start, int end) {
        
        int max = start;

        for(int i=0; i<=end; i++) {
              if(arr[max] < arr[i]) {
                 max = i;
              }
        }

        return max;
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    
}
