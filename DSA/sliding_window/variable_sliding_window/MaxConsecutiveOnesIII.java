package sliding_window.variable_sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
public class MaxConsecutiveOnesIII {

    
    
    
    // Brute Force Approach
    public int longestOnes(int[] arr, int k) {

        int i = 0;
        int j = 0;
        int zeroCount = 0;
        int len = arr.length;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        while(j < len) {

            if(arr[j] == 0) {
                zeroCount++;
            }

            while(zeroCount > k) {
                if(arr[i] == 0) {
                    zeroCount--;
                }
                i++;
            }

            ArrayList<Integer> range = new ArrayList<Integer>();
            range.add(i);
            range.add(j);
            map.put(j - i + 1, range);
            j++;
        }

        for(int it:map.keySet()) {
            max = Math.max(max, it);
        }
        return max;
    }




}
