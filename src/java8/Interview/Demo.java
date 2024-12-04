package java8.Interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> listofString = Arrays.asList("APPLE","Banana","Pinepiapple","jakfruite","APPLE","Orange","KIWI","Orrange");
        System.out.println(listofString.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }

}
