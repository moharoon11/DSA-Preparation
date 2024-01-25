package Searching.BinarySearch.Easy.Looking;

public class Sqrtx {

    public static void main(String... args) {

         System.out.println(sqrt(36));
         
         System.out.println(sqrt1(64));
    }
 

    static int sqrt(int x) {

        if(x==0 || x==1) {
            return x;
        }

        long start = 1; 
        long end = x;

        while(start <= end) {
             long mid = start + (end - start) / 2;

             if(mid == x / mid) {
                return (int) mid;
             } else if(mid > x / mid) {
                end = mid -1;
             } else {
                start = mid + 1;
             }
        }

        return (int) end;
    }

    static int sqrt1(int x) {

        if(x==0 || x==1) {
            return x;
        }

        long start = 1; 
        long end = x;

        while(start <= end) {
             long mid = start + (end - start) / 2;

             if(mid * mid == x) {
                return (int) mid;
             } else if(mid  * mid < x) {
                start = mid + 1;
             } else {
                end = mid - 1;
             }
        }

        return (int) end;
    }


    
}
