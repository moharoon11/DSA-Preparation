package Strings;

import java.util.Collections;
import java.util.Arrays;

public class ReverseWordsINString {

    public static void main(String[] args) {
         System.out.println(reverseWords("Reverse Sentence"));
        System.out.println(reverseWords(" Reverse Sentence "));
    }

    public static String reverseWords(String s) {

        String[] words = s.split(" ");

        String[] reversedWords = new String[words.length];

        int j=0;
        for(int i=words.length - 1; i>=0; i--) {
            reversedWords[j++] = words[i];
        }

        return String.join(" ", reversedWords);
    }

    public static String reverseWords1(String s) {

        String[] words = s.trim().split("\\s+");

        Collections.reverse(Arrays.asList(words));

        return String.join(" ", words);
    }
}
