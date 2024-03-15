package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IndianCoins {

    public static void main(String... args) {

        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int amount = 590;
        int minCoinsRequired = 0;
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++) {

                if(amount == 0) break;

                while(coins[i] <= amount) {
                    minCoinsRequired++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }

        }

        System.out.println("Total (min) no of coins required is " + minCoinsRequired);
        System.out.println(ans);
    }

}
