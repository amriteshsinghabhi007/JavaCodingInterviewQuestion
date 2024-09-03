package java8.TerminalOpration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class peek {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5);
        number.stream()
                .map(n->n*n)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
