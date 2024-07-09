package Bitmanipulation.interviewproblems;

public class XorNumbersFromLTR {

    public static void main(String[] args) {
        int left = 4; int right = 7;
        int ans = func(left - 1) ^ func(right);
        System.out.println(ans);
    }

    public static int func(int n) {
        if(n % 4 == 1) return 1;
        else if (n % 4 == 2) return n + 1;
        else if (n % 4 == 3) return 0;
        else return n;
    }
}
