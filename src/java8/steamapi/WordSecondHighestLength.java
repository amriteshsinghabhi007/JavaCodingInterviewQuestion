package java8.steamapi;

import java.util.Arrays;
import java.util.Comparator;

//Given a sentance, find the word that has the 2nd(nth) highest length
// Find the length of word.
public class WordSecondHighestLength {
    public static void main(String[] args) {

        String str = "I am SpringBoot Developer";
        String ans = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
        System.out.println(ans);


        int wordLength = Arrays.stream(str.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(wordLength);
    }
}
