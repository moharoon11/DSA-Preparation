package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayZeroAndOnes {


    public static void main(String args[]) {
        int n = 5;
        int arr[]={1,0,1,0,1};
        System.out.print("Before Sorting: ");
        for (int a: arr)
            System.out.print(a + " ");
        System.out.println();
        sort(arr);
        System.out.print("After Sorting: ");
        for (int a: arr)
            System.out.print(a + " ");
        System.out.println("-----------Two Pointer-------------------");

        int arr1[]={1,0,1,0,0,1, 1,1, 0,0,0,0,1};
        System.out.println(Arrays.toString(twoPointerSort(arr1)));

        int arr2[] = {1,1,1,0,0,1,1,0,0,0};

        twoPointerInPlace(arr2);
        System.out.println(Arrays.toString(arr2));
    }


    // brute force approach
    public static void sort(int[] arr) {

        int count = 0;
        int n = arr.length;

        for(int num:arr) {
            if(num == 0) count++;
        }

        for(int i=0; i<count; i++) {
            arr[i] = 0;
        }

        for(int i=count; i<n; i++) {
            arr[i] = 1;
        }
    }

    // Two pointer approach

    public static int[] twoPointerSort(int[] arr) {
        int[] ans = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;

        for(int num:arr) {
            if(num == 0) {
                ans[i++] = 0;
            } else {
                ans[j--] = 1;
            }
        }

        return ans;
    }

    public static void twoPointerInPlace(int[] arr) {
        int left = 0;
        int right  = arr.length -1;

        while(left < right) {

            if(arr[left] == 1) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = arr[left];
                right--;
            } else {
                left++;
            }
        }
    }


}
