package Sorting;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String... args) {
     int[] arr = {-1, -90, 0,33,21,1,3};

     bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {

        boolean isSwapped = false;

        for(int i=0; i<arr.length; i++) {
            for(int j=1; j<arr.length-i; j++) {

                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] =  arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;
                }

               
            }
            if(!isSwapped) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

}
