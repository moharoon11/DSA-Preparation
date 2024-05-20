package TwoPointer;

public class TwoSum {

    public static void main(String[] args) {
        int arr[]={1,3,4,5,7,10,11,19,20};
        int sum=7;

        func(arr, sum);
        func(arr, sum);
    }
    //brute force approach
    public static void func(int[] arr, int sum) {

        for(int i=0; i<arr.length - 1; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[i] + arr[j] == sum) {
                    System.out.println("I = " + i + " and J = " + j);
                    return;
                }
            }
        }

        System.out.println("No match found!");
    }

    // Two pointer approach
    public static void func2(int[] arr, int sum) {
        int low = 0;
        int high = arr.length - 1;

        while(low < high) {
            if(arr[low] + arr[high] == sum) {
                System.out.println("low = " + low + " high = " + high);
                return;
            } else if(arr[low] + arr[high] > sum) {
                high--;
            } else {
                low++;
            }
        }
    }
}
