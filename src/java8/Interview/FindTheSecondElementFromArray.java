package java8.Interview;

import java.util.Arrays;
import java.util.Comparator;

//Find the second highest element in array
public class FindTheSecondElementFromArray {
    public static void main(String[] args) {
        int arr [] = {12,23,55,78,34};
        Integer secondElement = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondElement);
    }
}
