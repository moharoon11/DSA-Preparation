package Sorting;

import java.util.Arrays;

/**
 from the given array take an element as pivot
 1.  pivot can be any random element but we are taking the last element as pivot
 2. then we need to put the pivot in it correct position 
 3. by the elements in the array if it is lesser then pivot it will come left side of pivot in the array
 4. if the elements in greater the elements will come right side of pivot in the array
 5. we can find the correct position of a pivot in single pass by comparing each element to pivot 
 6. then we apply quicksort for left and right side of the elements which is around pivot
 7. same process happen again again untill there is only one element in the array
 8. the base condition is low < high we do the quicksort else we do nothing 
 9. if low not less than high it must be >= high that means there is only one element
 10. a single element in array itself is sorted so dont need to apply quicksort 
 11. thats when low < high fails the methods finished executed and return to the caller
 */
public class QuickSort {


    public static void main(String... args) {

        int[] arr = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static int partition(int arr[], int low, int high) {

        int i = low-1;
        int pivot = arr[high];
        
        for(int j=low; j<=high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =  temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp; 

        return i;
    }

    private static void quickSort(int[] arr, int low, int high) {

          if(low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);

          }

    }
    
}
