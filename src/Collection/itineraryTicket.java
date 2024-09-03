package Collection;

import java.util.HashMap;

public class itineraryTicket {
    public static String getStart(HashMap<String,String> ticks){
        HashMap<String,String> revTick = new HashMap<>();
        for (String key : ticks.keySet()){
            revTick.put(ticks.get(key), key);
        }
        for (String key : ticks.keySet()){
            if(!revTick.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("chennai","banguluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

        String start = getStart(tickets);
        while (tickets.containsKey(start)){
            System.out.print(start+"->");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
