package DSA.Array;

public class LargestnumberInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,18,4,8,10};
        int sum = 0;
        for (int i = 0; i<arr.length;i++){
            if(arr[i] > sum){
                sum = arr[i];
            }
        }
        System.out.println(sum);
    }
}
