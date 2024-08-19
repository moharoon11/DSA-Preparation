package Recursion.Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MergeSortInPlace {

    public static void mergeSort(int[] arr, int start, int end) {
        if(start >= end) return;

        int middle = start + (end - start) / 2;
        mergeSort(arr, start, middle);
        mergeSort(arr, middle + 1, end);

        merge(arr, start, middle, end);
    }

    public static void merge(int[] arr, int start, int middle, int end) {
        List<Integer> temp = new ArrayList<>();
        int left = start;
        int right = middle + 1;

        while(left <= middle && right <= end) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while(left <= middle) { temp.add(arr[left++]); }
        while(right <= end) { temp.add(arr[right++]); };

        for(int i=start; i<=end; i++) {
            arr[i] = temp.get(i - start);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,4,7,6,3,1,5};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
