package java8.Interview;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class duplicateElemRemove {
    public static void main(String[] args) {
        List<String> li1 = Arrays.asList("java", "Python", "java", "spring", "boot", "boot");
        List<String> list2 = li1.stream().distinct().collect(Collectors.toList());
        System.out.println(list2);
    }

}
