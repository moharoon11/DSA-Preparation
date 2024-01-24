package Searching.BinarySearch.Easy.Looking;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args)  {

        int nums[] = {0,1,2,3,4,5,6,7,9};
        int ans = missingNumberBinarySearch(nums);
        int ans1 = missingNumber(nums);
        System.out.println(ans);
        System.out.println(ans1);
    }

    static int missingNumberBinarySearch(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        Arrays.sort(nums);
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > mid)  {
              end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int missingNumber(int[] nums) {

        // using the sum of consecutive numbers formula = (0 + n) * (n + 1) / 2,
        // n is length of the array
        int len = nums.length;
        int sum = (0 + len) * (len + 1) / 2;
        int actualSum = 0;

        for(int i=0; i<=nums.length-1; i++) {
            actualSum += nums[i];
        }

        // the missing number would be totalSum by the subtraction of actual sum of the array
        return sum - actualSum;
    }

    public int missingNumber1(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for(; i < nums.length; i++){
            if(nums[i] != i)
                return i;
        }
        return i;
    }
    
}
