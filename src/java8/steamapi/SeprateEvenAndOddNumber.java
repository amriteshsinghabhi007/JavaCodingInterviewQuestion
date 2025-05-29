package java8.steamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Given a list of integer,divide it into two lists one having an even number and the other having an odd number.
//input - {1,2,3,4,5,6,7,8};
//o/p - [[1, 3, 5, 7], [2, 4, 6, 8]]
// NOTE :- boxed() method use to convert the primitive type to list of Integer
public class SeprateEvenAndOddNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<List<Integer>> checkedList = list.stream()
                .collect(Collectors.groupingBy(x->x%2==0,Collectors.toList()))
                .entrySet()
                .stream()
                .map(x->x.getValue())
                .collect(Collectors.toList());
        System.out.println(checkedList);
    }
}
