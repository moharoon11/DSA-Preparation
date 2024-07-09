package Searching.BinarySearch.Easy.coding;

public class CountOccurenceOfGivenNumber {

    public static void main(String[] args) {
        int x = 3;
        int[] arr = {2, 2,3,3,3,3,3,3,3,3,3,3 , 4};
        int n = arr.length;
        System.out.println(bs(arr, n, x));
    }

    public static int bs(int[] arr, int n, int x) {
        int first = firstOccurrence(arr, n, x);
        if(first == -1) return -1;
        int last = lastOccurrence(arr, n, x);
        return (last - first) + 1;
    }

    public static int firstOccurrence(int[] arr, int n, int x) {

        int start = 0;
        int end = n - 1;
        int first = -1;
        while(start <= end) {

            int mid = start + ((end - start) >> 1);
            if(arr[mid] == x) {
                first = mid;
                end = mid - 1;
            } else if(arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return first;
    }

    public static int lastOccurrence(int[] arr, int n, int x) {

        int start = 0;
        int end = n - 1;
        int last = -1;
        while(start <= end) {

            int mid = start + ((end - start) >> 1);
            if(arr[mid] == x) {
                last = mid;
                start = mid + 1;
            } else if(arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return last;
    }



}
