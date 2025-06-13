package DSA.Array;

import java.util.Scanner;

public class FindSecondHighestNumber {
    static int findMax(int arr []){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static int findsecond(int arr []){
        int mx = findMax(arr);
        int nx = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == mx){
                arr[i] = nx;
            }
        }
        int secondValue = findMax(arr);
        return secondValue;
    }

    public static void main(String[] args) {
        int arr [] = {1,8,9,4,7,5};
        int secondNum = findsecond(arr);
        System.out.println(secondNum);
    }
}
