package Recursion.Easy;

// Leetcode 1342

/**
 *Example 1:
 *
 * Input: num = 14
 * Output: 6
 * Explanation:
 * Step 1) 14 is even; divide by 2 and obtain 7.
 * Step 2) 7 is odd; subtract 1 and obtain 6.
 * Step 3) 6 is even; divide by 2 and obtain 3.
 * Step 4) 3 is odd; subtract 1 and obtain 2.
 * Step 5) 2 is even; divide by 2 and obtain 1.
 * Step 6) 1 is odd; subtract 1 and obtain 0.
 */
public class _7NumberOfStepsToReduceNumberTOZero {

    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public int helper(int num, int steps) {
        if(num == 0) return steps;

        if(num % 2 == 0) {
            return helper(num / 2, steps + 1);
        }

        return helper(num -1, steps + 1);
    }
}
