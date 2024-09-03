package java8.TerminalOpration;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6);
        final Integer list = number
                .stream().reduce(0,(a,b)->a+b);
        System.out.println(list);
    }
}
