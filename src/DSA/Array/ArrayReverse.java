package DSA.Array;

public class ArrayReverse {

    static int[] reverse(int arr[]){
        int n = arr.length;
        int ans [] = new int[n];
        int j = 0;
        for(int i = n-1;i>=0;i--){
                ans[j++] = arr[i];
        }
        return ans;
    }
    static void print(int arr []){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5};
        print(reverse(myArray));
    }
}
