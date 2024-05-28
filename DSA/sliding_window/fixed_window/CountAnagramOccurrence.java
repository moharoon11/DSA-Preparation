package sliding_window.fixed_window;

import java.util.HashMap;
import java.util.Map;

public class CountAnagramOccurrence {

    public static void main(String[] args) {

        System.out.println(countOccurrenceOfAnagram("aabaabaa", "aaba"));
        System.out.println(countOccurrenceOfAnagram("cbaebabacd", "abc"));

    }

    public static int countOccurrenceOfAnagram(String s, String pattern) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(char c:pattern.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);


        int window_size = pattern.length();
        int window_start = 0;
        int window_end = 0;

        int count = map.size();

        while(window_end < s.length()) {

            char ch = s.charAt(window_end);

            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0) {
                    count--;
                }
            }

            if(window_end - window_start + 1 < window_size) {
                window_end++;
            } else if(window_end - window_start + 1 == window_size) {

                if(count == 0) ans++;



                char charAtWindowStart = s.charAt(window_start);

                if(map.containsKey(charAtWindowStart)) {
                     map.put(charAtWindowStart, map.get(charAtWindowStart) + 1);
                     if(map.get(charAtWindowStart) == 1) count++;
                }
                window_start++;
                window_end++;
            }

        }

        return ans;
    }
}
