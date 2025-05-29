package java8.Interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FindFirstRepated {
    public static void main(String[] args) {
        String input = "I am Software engineer";
        String FindFirstRepated = Arrays.stream(input.split("")).map(Character->Character.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey()).findFirst().get();

        System.out.println(FindFirstRepated);
    }
}
