package Recursion.Strings_Subsets;

import java.util.ArrayList;
import java.util.List;

public class _4SubSets {

    public static List<List<Integer>> getSubSets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr) {
            int size = outer.size();
            for(int i=0; i<size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> list = getSubSets(arr);
        for(List<Integer> i:list) {
            System.out.println(i);
        }
    }
}
