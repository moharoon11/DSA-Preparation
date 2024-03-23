package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String... args) {
        int[] nums = {1, 3, 2, 2, 2, 2, 2, 2, 2, 2,1,1,1,1, 5 , 1, 3, 1, 5, 1};

        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }

        for(Integer key:frequency.keySet()) {
            int length = nums.length / 3;
            int count = frequency.get(key);
            if(count > length) {
                System.out.print(key + " ");
            }
        }
    }
}
