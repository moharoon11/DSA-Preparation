package sliding_window;

public class MaximumSumOfSubarraySizeK {

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
