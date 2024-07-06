package Searching.BinarySearch.Easy.coding;

public class SquareRootOfNumber {

    public static void main(String... args) {
        System.out.println(binarySearchSquareRoot(11));
    }

    // brute force approach

    public static int squareRoot(int n) {
        int ans = 0;
        for(int i=1; i<=n; i++) {
            int square = i * i;
            if(square <= n) {
                ans = i;
            } else {
                break;
            }
        }

        return ans;
    }


    // using binarySearch

    public static int binarySearchSquareRoot(int n) {

        int start = 1;
        int end = n;


        while(start <= end) {
            int mid = (start + end) / 2;

            if(mid * mid == n) {
                return mid;
            } else if(mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
