package StringsQuestions.CountingOfSubstringsBasedOnSomeCondition;

import java.util.Collections;
import java.util.HashMap;

public class BeautyOfSubString {


    // using freq array
    public int beautySum(String s) {


        int sum = 0;
        int n = s.length();

        for(int i=0; i<n; i++) {
            int[] freq = new int[26];

            for(int j=i; j<n; j++) {
                freq[s.charAt(j) - 'a']++;
                if(j - i + 1 > 2) sum += isBeauty(freq);
            }
        }

        return sum;
    }

    public static int isBeauty(int[] freq) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int f:freq) {
            if(f > 0) {
                max = Math.max(max, f);
                min = Math.min(min, f);
            }

        }

        return max - min;
    }

    // using hashmap
    public int beautySumMap(String s) {
        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> freqMap = new HashMap<>();

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

                if (j - i + 1 > 2) {
                    int highestFrequency = Collections.max(freqMap.values());
                    int lowestFrequency = Collections.min(freqMap.values());
                    int difference = highestFrequency - lowestFrequency;
                    sum += difference;
                }
            }
        }

        return sum;
    }
}
