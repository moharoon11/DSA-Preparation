package Arrays;

public class RemoveDupliatesUnSortedArray {


    public static void main(String[] args) {
        int[] nums = {4, 5, 9, 4, 9, 1, 3, 5, 2};
        int newLength = remove(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int remove(int[] arr) {

        int writerPoint = 1;


        for(int readerPoint = 1; readerPoint < arr.length; readerPoint++) {
            boolean duplicate = false;

            for(int currentIndex = 0; currentIndex < writerPoint; currentIndex++) {
                if(arr[readerPoint] == arr[currentIndex]) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate) {

                if(readerPoint != writerPoint) {
                    arr[writerPoint] = arr[readerPoint];
                }

                writerPoint++;
            }
        }

        return writerPoint;
    }
}
