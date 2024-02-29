package Searching.BinarySearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        int[] arrD = {900, 800, 700, 600, 550, 500, 450, 400, 350, 300, 250, 200, 150, 100};
        int target = 16;
        int targetD =100;
        int ans = binarySearch(arr, target);
        int ansD = binarySearch(arrD, targetD);
        System.out.println(ans);
        System.out.println(ansD);

    }


    static int binarySearch(int[] arr, int target) {

         int start = 0;
         int end = arr.length - 1;
         boolean isAsc = arr[end] > arr[start];
        

         while(start <= end) {
              
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }


            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else{
                if(target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
           
         }

         return -1;
    }
    
}
