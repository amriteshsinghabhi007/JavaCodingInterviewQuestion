package java8.steamapi;

import java.util.Arrays;

//Given a sentence, Find the words with the specified number of vowels
//No of vowels = 2
public class CheckVowelInWord {
    public static void main(String[] args) {
        String str = "I am learning java stream Api for java developer xyz";
        Arrays.stream(str.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2).forEach(System.out::println);
    }
}
