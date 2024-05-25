package Strings;

public class LargestOddNumberInString {

    public static void main(String[] args) {
        System.out.println(largeOdd("1234444346"));
    }

    public static String largeOdd(String s) {

        for(int i=s.length()-1; i>=0; i--) {
            if((s.charAt(i) - '0') % 2 != 0) {
                return s.substring(0, i+1);
            }
        }

        return "";
    }
}
