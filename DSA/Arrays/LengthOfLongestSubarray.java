package Arrays;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*

// this is a sliding window question and this approach will not be applicable if negative integer comes
Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.

*/
class LengthOfLongestSubarray {

    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int N = 3;
        int K=5;

        int[] arr1 = {2,3,5,1,9};
        int N1 = 5;
        int K1 = 10;
        System.out.println(find(arr, N, K));
        System.out.println(find(arr1, N1, K1));


    }

    public static int find(int[] arr, int N, int K) {
        int max = 0;

        int i = 0;
        int j = 0;
        int sum = 0;

        while(j < N) {

            sum += arr[j];

            while(i <= j && sum > K) {
                sum -= arr[i];
                i++;
            }

            if(sum == K) {
                max = Math.max(max, j - i + 1);
            }


            j++;
        }

        return max;
    }
}