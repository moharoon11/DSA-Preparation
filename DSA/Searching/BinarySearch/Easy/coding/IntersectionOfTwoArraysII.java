package Searching.BinarySearch.Easy.coding;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> nums2List = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for(int num : nums2) {
            nums2List.add(num);
        }

        for(int num: nums1) {
           int nums2Index = binarySearch(nums2List, num);
           
           if(nums2Index != -1) {
                    result.add(num);

                    nums2List.remove(nums2Index);
           }
        }
        

        return result.stream().mapToInt(Integer::intValue).toArray();
        
    }

    int binarySearch(List<Integer> arr, int target) {
        int start = 0;
        int end = arr.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr.get(mid)) {
                return mid;
            } else if (target > arr.get(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }
    
}
