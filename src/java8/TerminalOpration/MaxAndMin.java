package java8.TerminalOpration;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> Value = Arrays.asList(-1,0,1,2,3,4,5,76,78,45,34,57,98);

        //Maximum Value
        int max = Value.stream()
                .max(Comparator.naturalOrder()).get();
        System.out.println("Max Value:- "+max);

        //Minimum Value
        int min = Value.stream()
                .min(Comparator.naturalOrder()).get();
        System.out.println("Min Value:- "+min);
    }
}
