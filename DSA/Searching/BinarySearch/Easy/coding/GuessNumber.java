package Searching.BinarySearch.Easy.coding;
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */


// question: Guess number higher of lower
public class GuessNumber {

    public int guessNumber(int n) {

        int start = 1;
        int end = n;

        int mid = 0;

        while(start <= end) {
                
            mid = start + (end - start) / 2;
           
            // function guess is an api call from leetcode so it will not work here
            // if(guess(mid) == -1) {
            //     end = mid - 1;
            // } else if(guess(mid) == 1) {
            //     start = mid + 1;
            // } else {
            //     return mid;
            // }
        }

        return -1;
        
    }
    
}
