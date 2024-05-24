package Arrays;

// this is a program for second largest and second smallest
public class SecondLargestElementWithoutSorting {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        // find(arr);
        findSecondLarge(arr, arr.length);
        findSecondSmallest(arr, arr.length);
    }


    // brute force approach
    // sort the array return the n-1 position array for second largest and i + 1 position for second small
    // this approach only works if there are no duplicates

    // better solution
    public static void find(int[] arr) {

        int large = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int sSmall = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            large = Math.max(large, arr[i]);
            small = Math.min(small, arr[i]);
        }

        for(int i=0; i<arr.length; i++) {

            if(arr[i] > slarge && arr[i] != large) {
                slarge = arr[i];
            }

            if(arr[i] < sSmall && arr[i] != small) {
                sSmall = arr[i];
            }
        }



        System.out.println("Largest element is = " + large);
        System.out.println("Second Largest element is = " + slarge);
        System.out.println("First small element is = " + small);
        System.out.println("Second small element is = " + sSmall);

    }


    // optimal approach find small and second small in one traversal

    public static void findSecondLarge(int[] arr, int n) {
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;


        for(int i=0; i<n; i++) {
            if(arr[i] > large) {
                second_large = large;
                large = arr[i];
            } else if(arr[i] < large && arr[i] > second_large) {
                second_large = arr[i];
            }
        }

        System.out.println("second largest element is = " + second_large);

    }

    public static void findSecondSmallest(int[] arr, int n) {
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        for(int i=0; i<n; i++) {

            if(arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if(arr[i] > small && arr[i] < second_small) {
                second_small = arr[i];
            }
        }

        System.out.println("Second smallest element is = " + second_small);
    }


}
