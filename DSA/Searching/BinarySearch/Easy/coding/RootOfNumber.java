package Searching.BinarySearch.Easy.coding;

public class RootOfNumber {

    public static void main(String[] args) {
        System.out.println(findRoot(27,3));
        System.out.println(binarySearchFindRoot(27,3));
    }

    // brute force
    public static int findRoot(int m, int n) {

        for(int i=1; i<=m; i++) {
            if(Math.pow(i, n) == m) return i;
            else if(Math.pow(i, n) > m) break;
        }
        return -1;
    }

    //binary search
    public static int binarySearchFindRoot(int m, int n) {
        int start = 1;
        int end = m;

        while(start <= end) {
            int mid = start + ((end - start) / 2);

            if(func(mid, m, n) == 1) {
                return mid;
            } else if(func(mid, m, n) == 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    //Return 1 if mid == m
    //Return 0 if mid < m
    //Return 2 if mid > m
    //Return 2 if mid > m
    public static int func(int mid, int m, int n) {

        int ans = 1;

        for(int i=1; i<=n; i++) {
            ans = ans * mid;
            if(ans > m) return 2;
        }

        if(ans == m) return 1;
        return 0;
    }


}
