package java8.steamapi;

import java.util.Arrays;
import java.util.Comparator;

//Find the highest length Str
public class WordHighestLength {
    public static void main(String[] args) {
        String str = "i am java Developer";
        String ans = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(ans);
    }
}
