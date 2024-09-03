package java8.IntermediateOperation;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,13,14,50,60,70);
        //Even Number
        numbers.stream().filter(n -> n%2 == 0).forEach(System.out::println);
        //Prime number
        numbers.stream().map(FilterExample::PrimeNumber).forEach(System.out::print);
    }
    public static int PrimeNumber(int n){
        int Flag = 0;
        for( int i = 2 ; i<= n/2; i++){
            if(n % i == 0){
                Flag = 1;
                break;
            }
        }
        return Flag == 0 ? n:0;
    }

}
