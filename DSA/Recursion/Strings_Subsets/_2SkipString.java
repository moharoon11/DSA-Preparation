package Recursion.Strings_Subsets;

public class _2SkipString {

    public static void skipString(String str, String target, String ans) {

        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        if(str.startsWith(target)) {
            skipString(str.substring(target.length()), target, ans);
        } else {
            skipString(str.substring(1), target, ans + str.charAt(0));
        }
    }
    public static void main(String[] args) {
        skipString("abcdappleefgh", "apple", "");
    }
}
