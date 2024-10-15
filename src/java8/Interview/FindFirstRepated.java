package java8.Interview;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepated {
    public static void main(String[] args) {
        String input = "I am Software engineer";

        Character result = input.chars()
                .mapToObj(e->Character.toLowerCase(Character.valueOf((char) e)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue() > 1L)
                .map(e->e.getKey())
                .findFirst().get();
        System.out.println(result);
    }
}
