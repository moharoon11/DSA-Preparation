package Searching.BinarySearch.Easy.coding;

public class FloorAndCeil {

    public static void main(String[] args) {
        int x = 5;
        int arr[] ={3, 4, 4, 7, 8, 10};
        System.out.println(floor(arr, x));
        System.out.println(ceil(arr, x));
    }


    private static int floor(int[] arr, int x) {
        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + ((end - start) >> 1);

            if(arr[mid] <= x) {
                ans = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    private static int ceil(int[] arr, int x) {
        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid  = start + ((end - start) >> 1);

            if(arr[mid] >= x) {
                ans = arr[mid];
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

}
