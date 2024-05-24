package Strings;

import java.util.*;

public class BasicStringProblemsMustKnow {

    public static void main(String[] args) {
        // Test String Reversal
        System.out.println("Reverse of 'hello': " + reverseString("hello"));

        // Test Palindrome Check
        System.out.println("Is 'racecar' a palindrome?: " + isPalindrome("racecar"));

        // Test Anagram Check
        System.out.println("Are 'listen' and 'silent' anagrams?: " + areAnagrams("listen", "silent"));

        // Test Count Vowels and Consonants
        countVowelsAndConsonants("hello");

        // Test Find Duplicate Characters
        System.out.println("Duplicate characters in 'programming': " + findDuplicateCharacters("programming"));

        // Test First Non-Repeating Character
        System.out.println("First non-repeating character in 'swiss': " + firstNonRepeatingCharacter("swiss"));

        // Test Longest Substring Without Repeating Characters
        System.out.println("Longest substring without repeating characters in 'abcabcbb': " + longestSubstringWithoutRepeatingCharacters("abcabcbb"));

        // Test Longest Common Prefix
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(strs));

        // Test String Rotation Check
        System.out.println("Is 'erbottlewat' a rotation of 'waterbottle'?: " + isRotation("waterbottle", "erbottlewat"));

        // Test Count Substrings
        System.out.println("Number of substrings in 'abc': " + countSubstrings("abc"));

        // Test String Compression
        System.out.println("Compressed string of 'aabcccccaaa': " + compressString("aabcccccaaa"));

        // Test String to Integer (atoi)
        System.out.println("String '123' to integer: " + stringToInteger("123"));

        // Test Check Subsequence
        System.out.println("Is 'abc' a subsequence of 'ahbgdc'?: " + isSubsequence("abc", "ahbgdc"));

        // Test Longest Palindromic Substring
        System.out.println("Longest palindromic substring in 'babad': " + longestPalindromicSubstring("babad"));

        // Test Remove Duplicates
        System.out.println("String 'banana' after removing duplicates: " + removeDuplicates("banana"));
    }

    // String Reversal
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Palindrome Check
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right++;
        }
        return true;
    }

    // Anagram Check
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    // Count Vowels and Consonants
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        String vowelsList = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowelsList.indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    // Find Duplicate Characters
    public static Map<Character, Integer> findDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> duplicates = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.put(entry.getKey(), entry.getValue());
            }
        }
        return duplicates;
    }

    // First Non-Repeating Character
    public static char firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }
        return '_'; // Return underscore if no non-repeating character is found
    }

    // Longest Substring Without Repeating Characters
    public static int longestSubstringWithoutRepeatingCharacters(String str) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0, i = 0, j = 0;
        while (j < str.length()) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j++));
                maxLen = Math.max(maxLen, j - i);
            } else {
                set.remove(str.charAt(i++));
            }
        }
        return maxLen;
    }

    // Longest Common Prefix
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    // String Rotation Check
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String combined = s1 + s1;
        return combined.contains(s2);
    }

    // Count Substrings
    public static int countSubstrings(String str) {
        int n = str.length();
        return n * (n + 1) / 2;
    }

    // String Compression
    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() - 1)).append(count);
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    // String to Integer (atoi)
    public static int stringToInteger(String str) {
        int result = 0, i = 0, sign = 1;
        if (str.length() == 0) return 0;
        while (i < str.length() && str.charAt(i) == ' ') i++;
        if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (str.charAt(i++) - '0');
        }
        return result * sign;
    }

    // Check Subsequence
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    // Longest Palindromic Substring
    public static String longestPalindromicSubstring(String str) {
        if (str == null || str.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < str.length(); i++) {
            int len1 = expandAroundCenter(str, i, i);
            int len2 = expandAroundCenter(str, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return str.substring(start, end + 1);
    }

    private static int expandAroundCenter(String str, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < str.length() && str.charAt(L) == str.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    // Remove Duplicates
    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            seen.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : seen) {
            result.append(c);
        }
        return result.toString();
    }
}

