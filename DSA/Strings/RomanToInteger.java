package Strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;

        for(int i=0; i<s.length(); i++) {
            if(i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                ans -= map.get(s.charAt(i));
            } else {
                ans += map.get(s.charAt(i));
            }
        }

        return ans;
    }

    public String intToRoman(int num) {
        // Define mappings of Roman numerals and their integer values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        // Iterate over the values and symbols arrays
        for (int i = 0; i < values.length; i++) {
            // Append the corresponding Roman numeral symbols while the value fits into the num
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }

        return roman.toString();
    }

    class Solution {
        public int romanToInt(String s) {
            // Define mappings of Roman numerals and their integer values
            Map<String, Integer> map = new HashMap<>();
            map.put("M", 1000);
            map.put("CM", 900);
            map.put("D", 500);
            map.put("CD", 400);
            map.put("C", 100);
            map.put("XC", 90);
            map.put("L", 50);
            map.put("XL", 40);
            map.put("X", 10);
            map.put("IX", 9);
            map.put("V", 5);
            map.put("IV", 4);
            map.put("I", 1);

            int result = 0;
            int i = 0;

            // Iterate over the string
            while (i < s.length()) {
                // Check if we have a two-character Roman numeral
                if (i < s.length() - 1 && map.containsKey(s.substring(i, i + 2))) {
                    result += map.get(s.substring(i, i + 2));
                    i += 2;
                } else {
                    result += map.get(s.substring(i, i + 1));
                    i += 1;
                }
            }

            return result;
        }
    }

}
