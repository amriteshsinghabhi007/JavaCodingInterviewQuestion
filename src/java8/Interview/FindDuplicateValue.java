package java8.Interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class FindDuplicateValue {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC", "CC");
        names.stream()
                .filter(x-> Collections.frequency(names, x)>1)
                .distinct()
                .forEach(System.out::println);
    }
}
