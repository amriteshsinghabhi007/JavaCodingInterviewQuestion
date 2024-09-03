package work;

import java.util.Scanner;

public class find_x_value_array {
    public static void main(String[]args){

        int[] arr = {1,2,3,4,24};
        int num = 24;
        boolean intArray = false;
        for(float element : arr){
            if(num == element){
                intArray= true;
                break;
            }
        }
        if(intArray){
            System.out.print("value present" );
        }
        else{
            System.out.print("value is not present");
        }

    }

}
