package DSA.Array;

import java.util.Scanner;

//Find the occurance of a particular element x
public class OccurenceOfX {

    static int findxvalue(int arr [], int x){
        int count = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]==x){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,5,6,7,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x value : ");
        int x = sc.nextInt();
        int y= findxvalue(arr,x);
        System.out.println(y);
    }
}
