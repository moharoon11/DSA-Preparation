package Arrays;

public class RepeatedAndMissingNumber {

    public static void main(String[] args) {
        int[] arr = {3,1,2,5,3};
        int n = arr.length;

        find(arr, n);
    }

    public static void find(int[] arr, int n) {

        int[] hash = new int[n + 1];
        int repeated = -1;
        int missing = -1;

        for(int i=0; i<n; i++) {
            hash[arr[i]]++;
        }

        for(int i=1; i<=n; i++) {
            if(hash[i] == 2) repeated = i;
            else if(hash[i] == 0) missing = i;

            if(repeated != -1 && missing != -1) break;
        }

        System.out.println("Repeated = " + repeated);
        System.out.println("Missing = " + missing);
    }
}
