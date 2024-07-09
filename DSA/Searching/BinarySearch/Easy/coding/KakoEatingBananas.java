package Searching.BinarySearch.Easy.coding;

public class KakoEatingBananas {

    public static void main(String[] args) {
        int[] arr = {7, 15, 6, 3};
        int h = 8;
        System.out.println(calcTime(arr, h));
    }

    // brute force
    public static int calcHours(int[] arr, int h) {
        int bph = 1;

        while(true) {
            int ht = 0;
            for(int bananas: arr) {
                ht += (int) Math.ceil((double) bananas/bph);
                if(ht > h) break;
            }

            if(ht <= h) {
                return bph;
            }

            bph++;
        }
    }

    // brute force approach
    public static int calcTime(int[] arr, int h) {
        int max = max(arr);
        int bt = 1;
        for(int i=1; i<=max; i++) {
            int hoursTaken = func(arr, i);
            if(hoursTaken <= h) {
                bt = i;
                break;
            }
        }

        return bt;
    }


    public static int func(int[] arr, int bt) {
        int hours = 0;

        for(int i=0; i<arr.length; i++) {
            hours += (int) Math.ceil((double) arr[i] / bt);
        }

        return hours;
    }

    private static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int num: arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    // binary search

    public int minEatingSpeed(int[] arr, int h) {
        int start = 1; int end = max(arr);

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int totalHoursTaken = func(arr, mid);
            if(totalHoursTaken <= h) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public int func1(int[] arr, int bph) {
        int hours = 0;
        for(int banana: arr) hours += Math.ceil((double)(banana) /(double)(bph));
        return hours;
    }


    public int max1(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int num: arr) {
            max = Math.max(max, num);
        }
        return max;
    }
}
