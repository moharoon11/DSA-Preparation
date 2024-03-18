package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithSumZero {

    public static void main(String... args) {

        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int sum = 0;
        int len = 0;

        for(int j=0; j<arr.length; j++) {

            sum += arr[j];

            if(map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            } else {
                map.put(sum, j);
            }

        }
        System.out.println("Largest Sub Array with sum as 0 => " + len);
    }

}
