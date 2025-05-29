package java8.Interview;

import java.util.Scanner;

public class CompressedString {
    public static String compress(String input) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                sb.append(input.charAt(i)).append(count);
                count = 1;
            }
        }
        String compressedString = sb.toString();
        return compressedString.length() < input.length() ? compressedString : input;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String out = compress(input);
        System.out.println(out);
    }
}
