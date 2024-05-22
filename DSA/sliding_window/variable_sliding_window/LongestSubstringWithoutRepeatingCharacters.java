package sliding_window.variable_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(getLongestSubstringWithoutRepeatingChars("pwwkew"));
    }
    public static int getLongestSubstringWithoutRepeatingChars(String s) {
        int max = 0;
        int i=0,j=0;

        Map<Character, Integer> map = new HashMap<>();
        while(j < s.length()) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if(map.size() == j-i+1) {
                max = Math.max(max, j-i+1);
                j++;
            } else  {

                while(map.size() < j - i + 1) {
                    char ctr = s.charAt(i);
                     map.put(ctr, map.get(ctr) - 1);
                     if(map.get(ctr) == 0) {
                         map.remove(ctr);
                     }
                     i++;
                }
                j++;
            }
        }

        return max;
    }

}
