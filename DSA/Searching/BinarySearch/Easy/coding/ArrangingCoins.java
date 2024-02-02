package Searching.BinarySearch.Easy.coding;

public class ArrangingCoins {
    public int arrangeCoins(int n) {

        long start = 1;
        long end = n;
   
        while(start <= end) {
            long mid = start + ( end - start ) / 2;
   
            // using sum of natural numbers formula to calculate the 
            // total number of coins used till now
            long coinsUsed = mid * (mid + 1) / 2;
   
            if(coinsUsed == n) {
                return (int) mid;
            } else if(coinsUsed < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
           
       return (int) end;
       }
}
