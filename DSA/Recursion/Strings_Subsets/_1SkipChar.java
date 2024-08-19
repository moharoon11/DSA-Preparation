package Recursion.Strings_Subsets;

public class _1SkipChar {

    public static void skipC(String str, String ans) {

        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        if(ch == 'a') {
            skipC(str.substring(1), ans);
        } else {
            skipC(str.substring(1), ans + ch);
        }
    }

    public static void main(String[] args) {
        skipC("daabacd", "");
    }
}
