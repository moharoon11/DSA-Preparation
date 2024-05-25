package Strings;

import java.util.Arrays;
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        String[] arr1 = {"hello", "hey", "heii"};
        System.out.println(getLongestCommonPrefix(arr));
        System.out.println(getLongestCommonPrefix(arr1));

        System.out.println(getLongestCommonPrefixOptimal(arr));
    }

    public static String getLongestCommonPrefix(String[] s) {

        String prefix = s[0];

        for(int i=1; i<s.length; i++) {
            while(s[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

   // optimal approach
    public static String getLongestCommonPrefixOptimal(String[] s) {

        Arrays.sort(s);
        String first = s[0];
        String last = s[s.length -1];


        int i=0;

        while(i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }
}
