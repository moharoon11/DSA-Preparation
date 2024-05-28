package sliding_window.variable_sliding_window;

public class LargestSubArrayOfSumK {

    public static void main(String[] args) {
        int[] nums = {4,1,1,1,2,3,5};
        System.out.println(getLargestSubArray(nums, 5));
    }

    public static int getLargestSubArray(int[] arr, int k) {
        int max = 0;

        int i=0, j=0;
        int sum = 0;

        while(j < arr.length) {
            sum += arr[j];
            while(sum > k){
              sum -= arr[i++];
            }
            if(sum == k) {
                max = Math.max(max, j-i+1);
            }
            j++;
        }

        return max;
    }
}
