package Arrays;

public class MaxConsecutiveOnes {


    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxCount(arr));
    }

    // brute force approach
    public static int findMaxCount(int[] arr) {

        int max = Integer.MIN_VALUE;
        int ones_count = 0;

        for(int num:arr) {
            if(num == 1) {
                ones_count++;
                max = Math.max(max, ones_count);
            } else {
                ones_count = 0;
            }
        }

        return max;
    }
}
