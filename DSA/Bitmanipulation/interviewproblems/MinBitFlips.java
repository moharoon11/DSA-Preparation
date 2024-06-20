package Bitmanipulation.interviewproblems;
// leetcode: 2220
public class MinBitFlips {

    public int minBitFlips(int start, int goal) {

        int ans = start ^ goal;
        int count = 0;

        while(ans != 0) {
            if( (ans & 1) != 0) count++;
            ans >>= 1;
        }

        return count;
    }
}
