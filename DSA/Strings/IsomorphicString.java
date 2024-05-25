package Strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {
        String s1 = "paper", s2 = "title";
        String s11 = "bar", s22 = "foo";

        System.out.println(isIsomorphic(s1, s2));
        System.out.println(isIsomorphic(s11, s22));
    }



        public static boolean isIsomorphic(String s, String t) {

            if(s.length() != t.length()) return false;

            Map<Character, Character> mappedLetters = new HashMap<Character, Character>();


            for(int i=0; i<s.length(); i++) {

                char original = s.charAt(i);
                char replacement = t.charAt(i);

                if(!mappedLetters.containsKey(original)) {
                    if(!mappedLetters.containsValue(replacement)) {
                        mappedLetters.put(original, replacement);
                    } else {
                        return false;
                    }
                } else {
                    char mappedCharacter = mappedLetters.get(original);
                    if(mappedCharacter != replacement) {
                        return false;
                    }
                }
            }


            return true;
        }



}
