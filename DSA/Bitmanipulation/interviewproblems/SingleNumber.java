package Bitmanipulation.interviewproblems;
// leetcode: 136
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i=0; i<nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }

}
