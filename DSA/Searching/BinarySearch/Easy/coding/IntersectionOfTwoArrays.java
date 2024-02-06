package Searching.BinarySearch.Easy.coding;
import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> n = new LinkedHashSet<>();

         Arrays.sort(nums1);

         for(int ele:nums2) {
            if(binarySearch(ele, nums1)) {
                n.add(ele);
            }
         }

         int arr[] = new int[n.size()];

         int k=0;
         for(Integer ele : n) {
             arr[k++] = ele;
         }

         return arr;
    }

    boolean binarySearch(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return true;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
