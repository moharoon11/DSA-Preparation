package Arrays;

import java.util.*;

public class FindUnion {

    public static void main(String... args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,3,4,4,5};
        System.out.println(findUnion(arr1, arr2));
        System.out.println(findUnionHashSet(arr1, arr2));
        System.out.println(findUnionTwoPointers(arr1, arr2));
    }


    // using hashmap
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int num:arr1) map.put(num, map.getOrDefault(num, 0) + 1);
        for(int num:arr2) map.put(num, map.getOrDefault(num, 0) + 1);
        for(int it:map.keySet()) result.add(it);
        return result;
    }

    public static ArrayList<Integer> findUnionHashSet(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int num:arr1) set.add(num);
        for(int num:arr2) set.add(num);
        for(int it:set) result.add(it);
        return result;
    }

    public static ArrayList<Integer> findUnionTwoPointers(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<Integer>();

        int i = 0, j = 0;

        while(i < arr1.length && j<arr2.length) {

            if(arr1[i] <= arr2[j]) {
                if(union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {

                if(union.size() == 0 || union.get(union.size() - 1)  != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < arr1.length) {

            if(union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while(j < arr2.length) {
            if(union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }


}
