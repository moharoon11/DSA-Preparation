package Hashing;

import java.util.HashMap;
import java.util.Map;

public class TicketIternaries {

    public static void main(String... args) {
        Map<String, String> tickets = new HashMap<String, String>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        System.out.print(start);

        for(String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }

        System.out.println();
    }

    private static String getStart(Map<String, String> tickets) {

        Map<String, String> revTick = new HashMap<String, String>();

        for(String key : tickets.keySet()) {
            revTick.put(tickets.get(key), key);
        }

        for(String key : tickets.keySet()) {
            if(!revTick.containsKey(key)) {
                return key;
            }
        }

        return null;
    }


}
