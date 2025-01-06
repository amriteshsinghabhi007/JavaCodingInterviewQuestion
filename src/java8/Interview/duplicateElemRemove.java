package java8.Interview;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicateElemRemove {
    public static void main(String[] args) {
        //REMOVE the DUPLICATE VALUES
        List<String> li1 = Arrays.asList("java", "Python", "java", "spring","boot","boot", "boot","Python","PHP");
        //find the duplicate string occur count
        Map<String,Long> list3 = li1.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))// Count the occurance of String
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1) // if greater the 1
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // get the keys and value of string
        System.out.println(list3);
    }
}
