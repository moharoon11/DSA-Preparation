package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class CountAnagramOccurrence {

    public static void main(String[] args) {

        System.out.println(countOccurrenceOfAnagram("aabaabaa", "aaba"));
        System.out.println(countOccurrenceOfAnagram("cbaebabacd", "abc"));

    }

    public static int countOccurrenceOfAnagram(String s, String p) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(char c:p.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);


        int k = p.length();
        int i = 0;
        int j = 0;
        int count = map.size();

        while(j < s.length()) {

            char ch = s.charAt(j);

            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0) {
                    count--;
                }
            }

            if(j - i + 1 < k) {
                j++;
            } else if(j - i + 1 == k) {

                if(count == 0) ans++;

                char charAtWindowStart = s.charAt(i);

                if(map.containsKey(charAtWindowStart)) {
                     map.put(charAtWindowStart, map.get(charAtWindowStart) + 1);
                     if(map.get(charAtWindowStart) == 1) count++;
                }
                i++;
                j++;
            }

        }

        return ans;
    }
}
