package Recursion.Arrays;

public class _1SortedArray {

    public static boolean isSorted(int[] arr, int index) {

        if(arr.length - 1 == index) return true;

        return (arr[index] < arr[index+1]) && isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 ={10,15,20,40,16,34,14,11};
        boolean result1 = isSorted(arr1, 0);
        boolean result2 = isSorted(arr2, 0);
        System.out.println(result1);
        System.out.println(result2);
    }

}
