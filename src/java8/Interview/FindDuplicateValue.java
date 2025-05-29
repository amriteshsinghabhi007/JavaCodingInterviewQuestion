package java8.Interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicateValue {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC", "CC");
        names.stream()
                .filter(x-> Collections.frequency(names, x)>1)
                .distinct()
                .forEach(System.out::println);

        List<String> name = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toList());
        System.out.println(name);
    }
}
