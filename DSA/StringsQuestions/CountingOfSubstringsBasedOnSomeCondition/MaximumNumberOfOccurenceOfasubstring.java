package StringsQuestions.CountingOfSubstringsBasedOnSomeCondition;

import java.util.*;

public class MaximumNumberOfOccurenceOfasubstring {

    // brute force approach
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {

            for(int j=i; j<s.length(); j++) {
                String temp = s.substring(i, j+1);

                if(isValid(temp, maxLetters, minSize, maxSize)) {
                    map.put(temp, map.getOrDefault(temp, 0) + 1);
                }
            }
        }


        return map.isEmpty() ? 0 : Collections.max(map.values());
    }

    public static boolean isValid(String temp, int maxLetters, int minSize, int maxSize) {
        if(temp.length() < minSize || temp.length() > maxSize) return false;

        Set<Character> unique = new HashSet<>();
        for(char c:temp.toCharArray()) {
            unique.add(c);
        }

        return unique.size() <= maxLetters;
    }

    // optimal approach
    public int maxFreqSlidingWindow(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> occurence = new HashMap<>();

        int left = 0;
        int right = 0;
        Map<Character, Integer> uniqueCheck = new HashMap<>();

        while(right < s.length()) {
            char cRight = s.charAt(right);

            uniqueCheck.put(cRight, uniqueCheck.getOrDefault(cRight, 0) + 1);


            if(right - left + 1 == minSize) {
                if(uniqueCheck.size() <= maxLetters) {
                    String temp = s.substring(left, right + 1);
                    occurence.put(temp, occurence.getOrDefault(temp, 0) + 1);
                }
                char cLeft = s.charAt(left);
                uniqueCheck.put(cLeft, uniqueCheck.get(cLeft) - 1);

                if(uniqueCheck.get(cLeft) == 0) {
                    uniqueCheck.remove(cLeft);
                }


                left++;
            }

            right++;
        }

        return occurence.isEmpty() ? 0 : Collections.max(occurence.values());
    }
}
