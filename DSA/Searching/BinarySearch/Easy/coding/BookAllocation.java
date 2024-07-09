package Searching.BinarySearch.Easy.coding;

public class BookAllocation {

    public static void main(String[] args) {
        int m = 2, arr[] = {12, 34, 67, 90};
        System.out.println(allocateBooks1(arr,m));
    }

    // brute force approach
    public static int allocateBooks1(int[] arr, int m) {
        if(m > arr.length) return -1;
        int start = max(arr);
        int end = sum(arr);

        for(int i=start; i<=end; i++) {
            int totalStudents = findNoOfStudents(arr, i);

            if(totalStudents == m) {
                return i;
            }
        }

        return start;
    }


    // binary search
    public static int allocateBooks2(int[] arr, int m) {
        if(m > arr.length) return -1;
        int start = max(arr), end = sum(arr);
        while(start <= end) {
           int mid = (start + end) / 2;
           int totalStudents = findNoOfStudents(arr, mid);

           if(totalStudents > m) {
               start = mid + 1;
           } else {
               end = mid - 1;
           }
        }
        return start;
    }

    public static int findNoOfStudents(int[] arr, int pageNumber) {
        int studentCount = 1;
        int pageCount = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] + pageCount <= pageNumber) {
                pageCount += arr[i];
            } else {
                studentCount++;
                pageCount = arr[i];
            }
        }

        return studentCount;
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for(int num:arr) sum+=num;
        return sum;
    }


    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
