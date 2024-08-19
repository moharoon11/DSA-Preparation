package Recursion.Strings_Subsets;

public class _3SubSeq {

    public static void printSubSequence(String str, String ans) {

        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        printSubSequence(str.substring(1), ans + str.charAt(0));
        printSubSequence(str.substring(1), ans);
    }

    public static void main(String[] args) {
        printSubSequence("abc", "");
    }

}
