package Bitmanipulation.interviewproblems;

import java.util.*;

// leetcode 78
public class SubSet {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int subsetSize = (int) Math.pow(2,n);
        for(int i=0; i<subsetSize; i++) {
            List<Integer> subset = new ArrayList<>();
            for(int j=0; j<n; j++) {
                if( (i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            ans.add(subset);
        }

        return ans;
    }
}
