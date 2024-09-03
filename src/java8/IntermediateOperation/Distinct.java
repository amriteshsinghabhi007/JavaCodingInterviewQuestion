package java8.IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,5,6,4,1);
        System.out.println((Integer) number.stream().distinct().peek(System.out::println).mapToInt(Integer::intValue).sum());

    }
}
