package Searching.BinarySearch.Easy.coding;

public class FloorAndCeil {

    public static void main(String[] args) {
        int x = 5;
        int arr[] ={3, 4, 4, 7, 8, 10};
        getResulr(arr, x);
    }

    private static void getResulr(int[] arr, int x) {


        int start = 0;
        int end = arr.length - 1;
        boolean ceil = false;
        boolean floor = false;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            while(!floor && start <= end) {

                if(x - 1 == arr[mid]) {
                    floor = true;
                    System.out.println(arr[mid]);
                }  else if(x - 1 > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

                if(start == arr.length - 1) break;
            }



            while(!ceil && start <= end) {
                if(x + 1 == arr[mid]) {
                    ceil = true;
                    System.out.println(arr[mid]);
                } else if(x + 1 > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

                if(end == 0) {
                    break;
                }
            }

        }

    }
}
