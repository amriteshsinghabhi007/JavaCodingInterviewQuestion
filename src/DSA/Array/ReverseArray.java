package DSA.Array;

import java.util.Arrays;

public class ReverseArray {
    public void reverse(int [] array){
        for(int i = 0; i<array.length/2;i++){
            int other = array.length-i-1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        ReverseArray ra = new ReverseArray();
        int [] myArray = {1,2,3,4,5};
        ra.reverse(myArray);
    }
}
