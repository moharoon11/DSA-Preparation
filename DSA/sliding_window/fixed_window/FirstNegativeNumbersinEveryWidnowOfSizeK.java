//package sliding_window.fixed_window;
//
//import java.util.*;
//
//public class FirstNegativeNumbersinEveryWidnowOfSizeK {
//
//
//    public static void main(String[] args) {
//
//        System.out.println(Arrays.toString(
//                firstNegativeInWindow(
//                        new int[] {12, -1, -7, 8, -15, 30, 16, 28}, 3)));
//    }
//
//    public static int[] firstNegativeInWindow(int[] arr, int k) {
//        List<Integer> result = new ArrayList<Integer>();
//
//        int i = 0;
//        int j = 0;
//        List<Integer> list = new LinkedList<Integer>();
//
//        while(j < arr.length) {
//
//            if(arr[j] < 0) {
//                list.add(arr[j]);
//            }
//
//            if(j - i + 1 < k) {
//                j++;
//            } else if(j - i + 1 == k) {
//
//                if(list.isEmpty()) {
//                    result.add(0);
//                } else {
//                    result.add(list.getFirst());
//
//                    if(arr[i] == list.getFirst()) {
//                        list.removeFirst();
//                    }
//                }
//
//                i++;
//                j++;
//            }
//
//        }
//
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
//}
