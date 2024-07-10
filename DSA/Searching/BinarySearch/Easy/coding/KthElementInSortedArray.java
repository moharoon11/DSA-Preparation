package Searching.BinarySearch.Easy.coding;

import java.util.Arrays;

public class KthElementInSortedArray {

    public static void main(String[] args) {
      int[] a = {2,3,6,7,9};
      int m = a.length;
      int[] b = {1,4,8,10};
      int n = b.length;
      int k = 5;
      System.out.println(findKth(a, b, m, n, k));
    }

    public static int findKth(int[] a, int[] b, int m, int n, int k) {

        if(m > n) {
            return findKth(b,a,n,m, k);
        }

        int start = Math.max(0, k - n);
        int end = Math.min(k, m);
        int left = k;
        while(start <= end) {
            int cut1 = (start + end) >> 1;
            int cut2 = left - cut1;

            int r1 = (cut1 < m) ? a[cut1] : Integer.MAX_VALUE;
            int r2 = (cut2 < n) ? b[cut2] : Integer.MAX_VALUE;
            int l1 = (cut1 - 1 >= 0) ? a[cut1 - 1] : Integer.MIN_VALUE;
            int l2 = (cut2 - 1 >= 0) ? b[cut2 - 1] : Integer.MIN_VALUE;

            if(l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if(l1 > r2) {
                end = cut1 - 1;
            } else {
                start = cut1 + 1;
            }
        }

        return 0;
    }
}
