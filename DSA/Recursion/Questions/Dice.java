package Recursion.Questions;

import java.util.ArrayList;
import java.util.List;

public class Dice {

    public static List<String> dice(String p, int target) {

        if(target == 0)
        {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> result = new ArrayList<>();

        for(int i=1; i<=6 && i<=target; i++) {
            result.addAll(dice(p + i, target - i));
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(dice("", 4));
    }
}
