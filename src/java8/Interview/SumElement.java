package java8.Interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class SumElement {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6,7,8};
          System.out.println(Arrays.stream(a).filter(x->x%2==0).peek(System.out::println).sum());
    }
}
