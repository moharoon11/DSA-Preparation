package Searching.BinarySearch.Easy.coding;

public class AggresiveCows {

    public static void main(String[] args) {
        int k = 4, arr[] = {0,3,4,7,10,9};
        System.out.println(func(arr, k));
    }

    public static int func(int[] stalls, int ncows) {

        int start = 1;
        int end = stalls[stalls.length - 1] - stalls[0];
        int ans = -1;
        while(start <= end) {
            int mid = (start + end) / 2;

            if(canWePlace(stalls, ncows, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    private static boolean canWePlace(int[] stalls, int ncows, int dist) {
         int countCows = 1;
         int last = stalls[0];

         for(int i=1; i<stalls.length; i++) {

             if(stalls[i] -last >= dist) {
                 last = stalls[i];
                 countCows++;
             }

             if(countCows >= ncows) return true;
         }

         return false;
    }
}
