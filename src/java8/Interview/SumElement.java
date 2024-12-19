package java8.Interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class SumElement {
    public static void main(String[] args) {
//        int[] a= {1,2,3,4,5,6,7,8};
//          System.out.println(Arrays.stream(a).filter(x->x%2==0).peek(System.out::println).sum());

        List<Integer> sum = Arrays.asList(12, 23, 17, 42, 33, 71, 56, 21);
        int sum1 = sum.stream().mapToInt((b)->b).sum();

        int sum2 =  sum.stream().filter(z->z%2==0).peek(System.out::println).mapToInt(a->a).sum();
        System.out.println(sum2);
        System.out.println(sum1);
    }
}
