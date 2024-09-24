package StringsQuestions.CountingOfSubstringsBasedOnSomeCondition;

/**
 * Leetcode 1915
 * ------------------

 *
 * A wonderful string is a string where at most one letter appears an odd number of times.
 *
 *     For example, "ccjjc" and "abab" are wonderful, but "ab" is not.
 *
 * Given a string word that consists of the first ten lowercase English letters ('a' through 'j'), return the number of wonderful non-empty substrings in word. If the same substring appears multiple times in word, then count each occurrence separately.
 *
 * A substring is a contiguous sequence of characters in a string.
 *
 *
 *
 * Example 1:
 *
 * Input: word = "aba"
 * Output: 4
 * Explanation: The four wonderful substrings are underlined below:
 * - "aba" -> "a"
 * - "aba" -> "b"
 * - "aba" -> "a"
 * - "aba" -> "aba"
 *
 * Example 2:
 *
 * Input: word = "aabb"
 * Output: 9
 * Explanation: The nine wonderful substrings are underlined below:
 * - "aabb" -> "a"
 * - "aabb" -> "aa"
 * - "aabb" -> "aab"
 * - "aabb" -> "aabb"
 * - "aabb" -> "a"
 * - "aabb" -> "abb"
 * - "aabb" -> "b"
 * - "aabb" -> "bb"
 * - "aabb" -> "b"
 *
 * Example 3:
 *
 * Input: word = "he"
 * Output: 2
 * Explanation: The two wonderful substrings are underlined below:
 * - "he" -> "h"
 * - "he" -> "e"
 *
 */

import java.util.*;

public class WonderFulSubstring {


    // Brute force method
    public static long wonderfulSubstrings(String word) {
        long count = 0;

        for(int i=0; i<word.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();

            for(int j=i; j<word.length(); j++) {
                char c = word.charAt(j);

                map.put(c, map.getOrDefault(c, 0) + 1);

                int oddCount = 0;


                for(int value: map.values()) {
                    if(value % 2 != 0) {
                        oddCount++;
                    }
                }

                if(oddCount <= 1) count++;
            }
        }

        return count;
    }



    // another brute approach
    public long wonderfulSubstringsanother(String word) {
        long count = 0;

        for(int i=0; i<word.length(); i++) {
            int[] freq = new int[10];
            for(int j=i; j<word.length(); j++) {
                freq[word.charAt(j) - 'a']++;

                if(isWonderful(freq)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isWonderful(int[] freq) {
        int oddCount = 0;
        for(int f:freq)  if(f % 2 != 0) oddCount++;
        return oddCount <= 1;
    }


     // optimal approach

    public static void main(String[] args) {
        String s = "aabb";
        long count = wonderfulSubstrings(s);
    }
}
