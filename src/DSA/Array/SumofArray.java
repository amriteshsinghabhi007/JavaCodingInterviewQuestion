package DSA.Array;

public class SumofArray {
    public static void main(String[] args) {
        int [] array = {1,3,5,6};
        int sum = 0;
        for(int i = 0; i<array.length;i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
