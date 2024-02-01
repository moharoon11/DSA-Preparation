package Searching.BinarySearch.Easy.coding;
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class FirstBadVersion {

    public int firstBadVersion(int n) {

        int start = 1;
        int end = n;


     

        while(start <= end) {
            
            int mid = start + ( end - start ) / 2;

            // isBadVersion(version) method given by leetcode 
            // if(isBadVersion(mid) == true && isBadVersion(mid - 1) == false) {
            //     return mid;
            // } else if(isBadVersion(mid) == false){
            //     start = mid + 1;
            // } else {
            //     end = mid;
            // }
        }

         return -1;
    }
    
}
