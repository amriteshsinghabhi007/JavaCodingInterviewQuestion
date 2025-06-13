package DSA.BasicOfJava.Conditionals;

import java.util.Scanner;
// Absolutevalue -  |-3| = 3 , |5| = 5, |-9| = 9
public class Absolutevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n < 0){ //if n is less then 0
            n = n * (-1);
        }
        System.out.println("The Absolute Value is : "+n);
    }
}
