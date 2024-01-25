package Searching.BinarySearch.Easy.Looking;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class later {

    public void helper(int[] nums, int start, int end, int target, List<Integer> list){
        if(start > end) return;
        int mid = (start + end)/2;
        if(nums[mid] == target){
            list.add(mid);
        }
        helper(nums, start, mid-1, target, list);
        helper(nums, mid+1, end, target, list);
    }
    
public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        helper(nums, 0, nums.length-1, target, list);
        Collections.sort(list);
        return list;
    }
}
