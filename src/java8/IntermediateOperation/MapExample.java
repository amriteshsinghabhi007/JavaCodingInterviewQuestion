package java8.IntermediateOperation;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        //UpperCase
        List<String> name = Arrays.asList("diptee","amritesh","nikesh");
        name.stream().map(String::toUpperCase).forEach(System.out::println);

        name.stream()
                .map(x->(String.valueOf(x.charAt(0))).toUpperCase())
                .forEach(System.out::println);

        name.stream()
                .map(MapExample::Capital) //method referance -single parameter
                .forEach(System.out::println);

        name.stream()
                .map(x->PositionCapital(x,2))
                .forEach(System.out::println);
    }
    public static String Capital(String name){

        return name.substring(0,1).toUpperCase()+name.substring(1);
    }
    public static String PositionCapital(String name,int i){
        return name.substring(0,i)+name
                .substring(i,i+1).toUpperCase()+name
                .substring(i+1);
    }
}
