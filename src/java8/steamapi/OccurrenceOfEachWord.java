package java8.steamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Find the occurance of the word
public class OccurrenceOfEachWord {
    public static void main(String[] args) {
        String str = "I am learning java stream Api for java developer";
        Map<String, Long> ans = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(ans);

    }
}
