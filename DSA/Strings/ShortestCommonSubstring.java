package Strings;

public class ShortestCommonSubstring {

    public static String shortestCommonSubstring(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String scs = strs[0];

        for (int i = 1; i < strs.length; i++) {
            scs = findCommonSubstring(scs, strs[i]);
        }

        return scs;
    }

    private static String findCommonSubstring(String str1, String str2) {
        int len = 0;
        while (len < str1.length() && len < str2.length() && str1.charAt(len) == str2.charAt(len)) {
            len++;
        }
        return str1.substring(0, len);
    }

    public static void main(String[] args) {
        String[] strs = {"abcdef", "abcf", "abcu"};
        System.out.println(shortestCommonSubstring(strs)); // Output: "abc"
    }
}
