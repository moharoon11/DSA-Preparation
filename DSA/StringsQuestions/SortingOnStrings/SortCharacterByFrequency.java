package StringsQuestions.SortingOnStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortCharacterByFrequency {

    public String frequencySort(String s) {

        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c:s.toCharArray()) freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

        Queue<Character> maxHeap  = new PriorityQueue<Character>((a, b) -> freqMap.get(b) - freqMap.get(a));
        maxHeap.addAll(freqMap.keySet());
        StringBuilder result = new StringBuilder();

        while(!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            int freq = freqMap.get(c);

            for(int i=1; i<=freq; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
