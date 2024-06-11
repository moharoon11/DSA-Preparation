package Searching.BinarySearch.Easy.coding;

public class FloorAndCeil {

    public static void main(String[] args) {
        int n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5;
        getResulr(arr, x);
    }

    private static void getResulr(int[] arr, int x) {


        int start = 0;
        int end = arr.length - 1;
        boolean ceil = false;
        boolean floor = false;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(!ceil  && Math.ceil((double) x) == arr[mid]) {
                System.out.println(arr[mid]);
                ceil =  true;
                end  = mid - 1;
            } else if(!ceil && Math.ceil((double) x) > arr[mid]) {
                end  = mid - 1;
            } else if(!ceil && Math.ceil((double) x) < arr[mid]){
                start = mid + 1;
            }

            if(!floor && Math.floor((double) x) ==  arr[mid]) {
                System.out.println(arr[mid]);
                floor = true;
                start  = mid + 1;
            }  else if(!floor && Math.floor((double) x) < arr[mid]) {
                end  = mid - 1;
            } else if(!floor && Math.floor((double) x) > arr[mid]){
                start = mid + 1;
            }

        }

    }
}
