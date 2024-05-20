package sliding_window;

import java.util.*;

public class FirstNegativeNumbersinEveryWidnowOfSizeK {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(firstNegativeInWindow(new int[] {12, -1, -7, 8, -15, 30, 16, 28}, 3)));
    }

    public static int[] firstNegativeInWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<Integer>();

        int i = 0;
        int j = 0;
        List<Integer> list = new LinkedList<Integer>();

        while(j < arr.length) {

            if(arr[j] < 0) {
                list.add(arr[j]);
            }

            if(j - i + 1 < k) {
                j++;
            } else if(j - i + 1 == k) {

                if(list.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(list.getFirst());

                    if(arr[i] == list.getFirst()) {
                        list.removeFirst();
                    }
                }

                i++;
                j++;
            }

        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

/**
 * public List<Integer> findAnagrams(String s, String p) {
 *         List<Integer> ans = new ArrayList<>();
 *
 *         int k = p.length();
 *         HashMap<Character, Integer> map = new HashMap<>();
 *
 *         for(int i=0;i<k;i++){
 *             char ch = p.charAt(i);
 *             if(map.containsKey(ch)){
 *                 map.put(ch, map.get(ch)+1);
 *             }
 *             else{
 *                 map.put(ch, 1);
 *             }
 *         }
 *
 *         int count = map.size();
 *         int i = 0, j = 0;
 *
 *         while(j < s.length()){
 *             // Calculation:
 *             char ch = s.charAt(j);
 *             if(map.containsKey(ch)){
 *                 map.put(ch, map.get(ch)-1);
 *                 if(map.get(ch) == 0){
 *                     count--;
 *                 }
 *             }
 *
 *
 *             if(j-i+1 < k){
 *                 j++;
 *             }
 *             else if(j-i+1 == k){
 *                 if(count == 0){
 *                     ans.add(i);
 *                 }
 *                 char ch1 = s.charAt(i);
 *                 if(map.containsKey(ch1)){
 *                     map.put(ch1, map.get(ch1)+1);
 *                     if(map.get(ch1) == 1){
 *                         count++;
 *                     }
 *                 }
 *                 i++;
 *                 j++;
 *             }
 *         }
 *
 *         return ans;
 *     }
 */
