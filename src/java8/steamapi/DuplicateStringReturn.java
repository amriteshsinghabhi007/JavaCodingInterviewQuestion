package java8.steamapi;

import java.util.Arrays;

//Remove duplicate from the string and return in the same order
//  I/P: String str = "dabcadefg"
// O/P: dabcefg
public class DuplicateStringReturn {
    public static void main(String[] args) {
        String str = "dabcadefg";
        Arrays.stream(str.split("")).distinct().forEach(System.out::print);
    }
}
