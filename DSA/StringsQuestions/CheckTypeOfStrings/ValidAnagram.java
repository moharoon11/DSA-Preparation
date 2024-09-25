package StringsQuestions.CheckTypeOfStrings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    // using hasharray
    // This is better and readable
    public boolean isAnagram(String s, String t) {

        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int[] store = new int[26];

        // if we have same number of char and occurrence at the end it will be balanced
        // thats the logic behind this
        for(int i=0; i<s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }


        for(int n:store) if(n != 0) return false;

        return true;
    }

    // using hashmap
    public boolean isAnagramHashMap(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freqMap = new HashMap<>();

        for(char ch:s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for(char ch:t.toCharArray()) {
            if(!freqMap.containsKey(ch)) {
                return false;
            } else {
                freqMap.put(ch, freqMap.get(ch) - 1);

                if(freqMap.get(ch) == 0) {
                    freqMap.remove(ch);
                }
            }
        }
        // or u can directly return true cause it will definitely be empty if we reach this return statement
        return freqMap.isEmpty();
    }
}
