package java8.Interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLongestStringInArray {
    public static void main(String[] args) {
        String [] names = {"Suraj","Amri","Shashank","Aman","Rahul"};
        int maxLength = Arrays.stream(names)
                .mapToInt(String::length)
                .max()
                .orElse(0);

        Arrays.stream(names).filter(e->e.length() == maxLength).forEach(System.out::println);
    }
}
