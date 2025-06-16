package DSA.Array;

public class ReverseArrayUsingSwap {
    static void swapInArray(int arr[],int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }
    static void print(int arr []){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
            int [] myArray = {1,2,3,4,5};
            reverse(myArray);
            print(myArray);
        }
    }

