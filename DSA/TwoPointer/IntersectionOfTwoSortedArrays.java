package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoSortedArrays {

    public static void main(String[] args) {

        int a[]= {1,2,3,3,4,5,6,7};
        int b[]= {3,3,4,4,5,8};

        System.out.println(Arrays.toString(findIntersect(a, b)));
        System.out.println(Arrays.toString(twoPointer(a, b)));

    }

    // brute force approach

    public static int[] findIntersect(int[] a, int[] b) {
        List<Integer> result = new ArrayList<Integer>();
        int[] visited = new int[b.length];

        for(int i=0; i<a.length; i++) {
            for(int j=0; j<b.length; j++) {

                if(a[i] == b[j] && visited[j] == 0) {
                    result.add(a[i]);
                    visited[j] = 1;
                    break;
                } else if(b[j] > a[i]) {
                    break;
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // Two pointer approach

    public static int[] twoPointer(int[] a, int[] b) {
        List<Integer> result = new ArrayList<Integer>();

        int i = 0, j = 0;

        while(i < a.length && j < b.length) {

            if(a[i] < b[j]) {
                i++;
            } else if(a[i] > b[j]) {
                j++;
            } else {
                result.add(a[i]);
                i++;
                j++;
            }

        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
