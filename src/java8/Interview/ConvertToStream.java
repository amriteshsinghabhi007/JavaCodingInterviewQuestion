package java8.Interview;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStream {
    public static void main(String[] args) {
        // premitive Array
        int[] primitive = {1,2,3,4,5};
        //object Array
        Integer[] object = {1,2,3,4,5};

        final IntStream intStream = Arrays.stream(primitive);
        intStream.forEach(System.out::println);

        final Stream<Integer> integerStream = Stream.of(object);
        integerStream.forEach(System.out::println);
    }
}
