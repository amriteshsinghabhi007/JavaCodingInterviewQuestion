package java8.IntermediateOperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,11,4,5,6,10,7);
        number.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        List<String> ListName = Arrays.asList("Amritesh","shashank","rahul","Amri");
        ListName.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
    }
}
