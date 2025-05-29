package Collection;
import java.util.*;
public class maps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India",123);
        map.put("Aus",122);
        map.put("CHN", 124);

        System.out.println(map);

        //searching
       if(map.containsKey("Aus")){
           System.out.println("it's present");
       }
       else {
           System.out.println("it's does not present");
       }

       for(Map.Entry<String, Integer> e : map.entrySet()){
           System.out.println(e.getKey());
           System.out.println(e.getValue());
       }

       for (Map.Entry<String,Integer> e : map.entrySet()){
           System.out.println(e.getValue());
           System.out.println(e.getKey());
       }
       //remove
        map.remove("Aus");
        System.out.println(map);
    }

}
