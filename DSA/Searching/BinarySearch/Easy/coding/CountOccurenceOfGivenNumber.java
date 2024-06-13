package Searching.BinarySearch.Easy.coding;

public class CountOccurenceOfGivenNumber {

    public static void main(String[] args) {

        int n = 7, x = 3;
        int[] arr = {2, 2 , 3 , 3 , 3 , 3 , 4};

        System.out.println(bs(arr, n, x));

    }

    public static int bs(int[] arr, int n, int x) {
        int count  = -1;
        int first = firstOccurence(arr, n, x);
        if(first == -1) return 0;
        int last = lastOccurence(arr, n, x);
        return (last - first) + 1;
    }

    public static int firstOccurence(int[] arr, int n, int x) {

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

    public static int lastOccurence(int[] arr, int n, int x) {

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
