package java8.Interview;

import java.util.*;
import java.util.stream.Collectors;

public class MapSort {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("One",5);
        map.put("Two",8);
        map.put("Three",1);
        map.put("Fourth",0);

        Map<String, Integer> sortedStudentMap
                = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(map);
        System.out.println(sortedStudentMap);
    }
}
