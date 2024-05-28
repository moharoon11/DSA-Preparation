package sliding_window.variable_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUniqueChars {


    public static void main(String[] args) {
        System.out.println(findLongSub("aabaacbebebe", 3));
    }



    public static int findLongSub(String s, int k) {
        int max = 0;
        int i=0, j=0;
        Map<Character, Integer> map = new HashMap<>();
        while(j < s.length()) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.size() > k) {
                char ctr = s.charAt(i);
                map.put(ctr, map.get(ctr) - 1);
                if(map.get(ctr) == 0)
                    map.remove(ctr);
                i++;
            }
            if(map.size() == k) max = Math.max(max, j - i + 1);
            j++;
        }

        return max;
    }
}
