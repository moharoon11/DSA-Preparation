package Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {1,2,4,5};
        int N = 5;
        System.out.println(missingNumber(arr, N));
        System.out.println(missingNumberUsingHashArray(arr, N));
        System.out.println(missingNumberOptimal(arr, N));
    }


    // brute force approach
    public static int missingNumber(int[] arr, int N) {

        for(int i=1; i<=N; i++) {
            boolean flag = false;
            for(int j=0; j<N-1; j++) {
                if(arr[j] == i) {
                    flag = true;
                    break;
                }
            }

            if(flag == false) return i;
        }

        return -1;
    }

    // better approach using hash array

    public static int missingNumberUsingHashArray(int[] arr, int N) {
        int[] hash = new int[N + 1];
        for(int num:arr) hash[num]++;
        for(int i = 1; i<N-1; i++)
            if(hash[i] == 0) return i;
        return -1;
    }

    public static int missingNumberOptimal(int[] arr, int N) {
        int sum = (N * (N + 1)) / 2;
        int arrSum = 0;
        for(int num:arr) arrSum += num;

        return sum - arrSum;
    }
}
