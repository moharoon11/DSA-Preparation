package Searching.BinarySearch.Easy.coding;

public class FindKRotation {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findKRotation(arr, arr.length);
        System.out.println(findNumberOfRotation(arr));
        System.out.println("The array is rotated " + ans + " times.");
    }


    // brute force approach
    public static int findNumberOfRotation(int[] arr) {

        int ans = Integer.MAX_VALUE;
        int index = -1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < ans) {
                ans = arr[i];
                index = i;
            }
        }

        return index;
    }

    // binary search
    public static int findKRotation(int[] arr, int n) {
      int index = -1;
      int ans = Integer.MAX_VALUE;

      int start = 0;
      int end = n - 1;

      while(start <= end) {

          int mid = start + ((end - start) >> 1);

          if(arr[start] <= arr[end]) {
              if(arr[start] < ans) {
                  ans = arr[start];
                  index = start;
              }
              break;
          }

          if(arr[start] <= arr[mid]) {
              if(arr[start] < ans) {
                  ans = arr[start];
                  index = start;
              }
              start = mid + 1;
          } else {
                if(arr[mid] < ans) {
                    ans = arr[mid];
                    index = mid;
                }
                end = mid - 1;
          }
      }

      return index;
    }
}
