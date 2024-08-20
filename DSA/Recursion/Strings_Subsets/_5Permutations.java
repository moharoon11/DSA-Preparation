package Recursion.Strings_Subsets;

import java.util.ArrayList;

public class _5Permutations {



    public static void printPermutations(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        for(int i=0; i<=p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            printPermutations(first + up.charAt(0) + second, up.substring(1));
        }
    }

    public static ArrayList<String> getPermutations(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<=p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(getPermutations(first + up.charAt(0) + second, up.substring(1)));
        }

        return ans;
    }

    public static int countPermutations(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        for(int i=0; i<=p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count += countPermutations(first + up.charAt(0) + second, up.substring(1));
        }

        return count;
    }
    public static void main(String[] args) {
        printPermutations("", "abc");
        System.out.println(getPermutations("", "abc"));
        System.out.println(countPermutations("", "abc"));
    }
}
