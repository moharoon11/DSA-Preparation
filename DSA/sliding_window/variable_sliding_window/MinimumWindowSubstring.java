package sliding_window.variable_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static void main(String[] args) {

        String s = "TOTMTATTAT";
        String p = "TTA";

        System.out.println(findMinWindowSubstring(s, p));
    }

    public static int findMinWindowSubstring(String s, String p) {
        int min = Integer.MAX_VALUE;

        Map<Character, Integer> map = new HashMap<Character, Integer>();


        for(char ch:p.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
        int count = map.size();

        int i=0,j=0;


        while(j < s.length()) {

            char ch = s.charAt(j);

            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0) {
                    count--;
                }
            }

            while(count == 0) {
                min = Math.min(min, j-i+1);

                char c = s.charAt(i);

                if(map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                    if(map.get(c) == 1) count++;
                }
                i++;
            }

            j++;
        }

        return min;
    }
}
