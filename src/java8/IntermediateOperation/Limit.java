package java8.IntermediateOperation;

import java.util.Arrays;
import java.util.List;

public class Limit {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,11,4,5,6,10,7);
        number.stream()
                .limit(4).forEach(System.out::println);
    }
}
