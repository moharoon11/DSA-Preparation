package Hashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {



    public static void main(String... args) {
        String s = "race";
        String t = "care";
        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<s.length(); i++) {
            char cc = s.charAt(i);
            map.put(cc, map.getOrDefault(cc,0) + 1);
        }

        for(int i=0; i<t.length(); i++) {

            char cc = t.charAt(i);
            if(map.get(cc) != null) {
                if(map.get(cc) == 1) map.remove(cc);
                else map.put(cc, map.get(cc) -1);
            } else {
                return false;
            }
        }


        return map.isEmpty();
    }
}
