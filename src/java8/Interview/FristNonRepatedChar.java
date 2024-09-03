package java8.Interview;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FristNonRepatedChar {
    public static void main(String[] args) {
        String input = "I am Software engineer";
        Character NonRepatedChar = input.chars()
                .mapToObj(s->Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))    //Store the chars in map with count
                .entrySet().stream()
                .filter(e->e.getValue() == 1L)
                .map(e->e.getKey())
                .findFirst().get();

        System.out.println(NonRepatedChar);
    }
}
