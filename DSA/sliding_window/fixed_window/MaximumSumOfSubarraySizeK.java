package sliding_window.fixed_window;

/**
 *
 * Two Sum
 * Roman to Integer
 * Palindrome Number
 * Maximum Subarray
 * Remove Element
 * Contains Duplicate
 * Add Two Numbers
 * Majority Element
 * Remove Duplicates from Sorted Array
 * Valid Anagram
 * Group Anagrams
 */
public class MaximumSumOfSubarraySizeK {

    // [1,2,3,4,5,6,7];
    public static int slidingWindow(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int i=0;
        int j=0;
        int sum = 0;
        while(j < arr.length) {

            sum += arr[j];
            if(j - i + 1 < n) {
                j++;
            } else if(j - i + 1 == n) {
                max = Math.max(max, sum);
                sum -= arr[i];
                j++;
                i++;
            }
        }

        return max;
    }
}
