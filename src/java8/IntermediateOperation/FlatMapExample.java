package java8.IntermediateOperation;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listoflist = Arrays.asList(
                Arrays.asList("a","b"),
                Arrays.asList("c","d"),
                Arrays.asList("e","f")
        );
        listoflist.stream()
                .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
