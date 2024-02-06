package Searching.BinarySearch.Easy.coding;
import java.util.Arrays;

/**
 * 1346. Check If N and Its Double Exist
Solved
Easy
Topics
Companies
Hint
Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 

Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
Example 2:

Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.
 

Constraints:

2 <= arr.length <= 500
-103 <= arr[i] <= 103
 * 
 * 
 */
public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);

        
        

        for (int i = 0; i < arr.length; i++) {

            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (arr[i] == 2 * arr[mid] && i != mid) {
                    return true;
                } else if (arr[i] < 2 * arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }

        return false;
    }
    
}
