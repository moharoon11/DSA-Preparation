package Searching.BinarySearch.Easy.coding;

public class MinimumDaysToMakeMBoquets {

    public static void main(String... args) {
       int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
       int m = 2;
       int k = 3;
        System.out.println(mBoquets(arr, m, k));
    }

    // binary search
    public static int mBoquets(int[] arr, int m, int k) {

        int val = m * k;
        if(arr.length < val) return -1;

        int[] minMax = findMax(arr);
        int start = minMax[0];
        int end = minMax[1];
        while(start <= end) {
            int mid = (start + end) / 2;
            int nb = calculateBoques(arr, mid, m, k);

            if(nb >= m) {
                end = mid - 1;
            } else if(nb < m) {
                start = mid + 1;
            }
        }

        return start;
    }

    public static int calculateBoques(int[] arr, int day, int m, int k) {
        int counter = 0;
        int boques = 0;
        for(int bloomingDay: arr) {
            if(bloomingDay <= day) {
                counter++;
            } else if(bloomingDay > day) {
                counter = 0;
            }

            if(counter == k) {
                boques++;
                counter = 0;
            }
        }

        return boques;
    }

    private static int[] findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num: arr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return new int[] {min, max};
    }
}
