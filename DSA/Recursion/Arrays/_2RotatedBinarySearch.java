package Recursion.Arrays;

public class _2RotatedBinarySearch {

    public static boolean search(int[] arr, int start, int end, int target) {

        if(start > end) return false;

        int middle = start + (end - start) / 2;

        if(arr[middle] == target) return true;

        if(arr[start] <= arr[middle]) {
            if(arr[start] <= target && target <= arr[middle]) {
                return search(arr, start, middle - 1, target);
            } else {
                return search(arr, middle + 1, end, target);
            }
        }

        if(arr[middle] <= target && target <= arr[end]) {
            return search(arr, middle + 1, end, target);
        }

        return search(arr, start, middle - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        boolean result = search(arr, 0, arr.length - 1, 12);
        System.out.println(result);
    }
}
