package DSA.Array;

import java.util.Scanner;

public class FindXValue {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int x = sc.nextInt();
        int ans = -1;
        for(int i = 0;i<arr.length;i++) {
            if (x==arr[i]) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
