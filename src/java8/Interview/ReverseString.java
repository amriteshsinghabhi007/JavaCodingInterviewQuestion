package java8.Interview;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String sentence = "Hello World"; //
        // 1. dlroW olleH
        String reverseString= Stream.of(sentence).map(string -> new StringBuilder(string).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reverseString);

        Scanner scanner = new Scanner(System.in);

        // 2.olleH dlroW
        // Step 1: user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Reverse each word using Java 8 streams
        String result = Stream.of(input.split(" ")).peek(System.out::println)         // Split the string into words
                .map(word -> new StringBuilder(word).reverse().toString())  // Reverse each word
                .collect(Collectors.joining(" "));  // Join the reversed words back into a string

        // Step 3: Display the result
        System.out.println("Reversed words: " + result);
    }
}

