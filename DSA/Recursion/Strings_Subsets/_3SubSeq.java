package Recursion.Strings_Subsets;

import java.util.ArrayList;

public class _3SubSeq {

    public static void printSubSequence(String str, String ans) {

        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        printSubSequence(str.substring(1), ans + str.charAt(0));
        printSubSequence(str.substring(1), ans);
    }

    public static ArrayList<String>  getSubSequence(String str, String ans) {

        if(str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> left = getSubSequence(str.substring(1), ans + str.charAt(0));
        ArrayList<String> right = getSubSequence(str.substring(1), ans);

        left.addAll(right);
        return left;
    }

    public static void printSubSequenceAscii(String str, String ans) {

        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        printSubSequenceAscii(str.substring(1), ans + str.charAt(0));
        printSubSequenceAscii(str.substring(1), ans);
        printSubSequenceAscii(str.substring(1), ans + (str.charAt(0) + 0));
    }

    public static void main(String[] args) {
        //printSubSequence("abc", "");
     //   System.out.println(getSubSequence("abc", ""));
        printSubSequenceAscii("abc", "");
    }

}