package Searching.BinarySearch.Easy.coding;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int nums[] = {1, 3, 4, 6};
        int target = 2;

        int ans = searchInsertPosition(nums, target);
        System.out.println("the answer is");
        System.out.println(ans);

    }

    static int searchInsertPosition(int[] nums, int target) {
        int start =0;
        int end = nums.length - 1;
        while(start <= end) {
            int m = start + (end - start) / 2;
            if(target == nums[m]) return m;
            else if (target > nums[m]) start = m + 1;
            else end = m - 1;
        }
        return start;
    }

   
}