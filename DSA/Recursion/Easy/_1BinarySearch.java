package Recursion.Easy;

public class _1BinarySearch {

    public static int search(int[] arr, int target, int start, int end) {

        if(start > end) return -1;

        int middle = start + (end - start) / 2;

        if(arr[middle] == target) {
            return arr[middle];
        }

        if(arr[middle] < target) {
            return search(arr, target, middle + 1, end);
        }

        return search(arr, target, start, middle -1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,66,78};
        int target = 55;
        int ans = search(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

}
