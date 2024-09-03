package java8.Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoning {
    public static void main(String[] args) {
        List<String> ListJoiner = Arrays.asList("Jeera","Azure","Trello","Jenkins");
        String ListJoinerResult =
                ListJoiner.stream()
                        .collect(Collectors.joining("-> ", "[","]"));
        System.out.println(ListJoinerResult);
    }
}
