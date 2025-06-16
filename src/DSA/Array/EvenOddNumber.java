package DSA.Array;
//i/p = {1,2,3,4,5,6,7,8,9}
//o/p = {2,4,6,8,1,3,5,7,9} // sort based on even and odd. order should be anything.
public class EvenOddNumber {
    static void swap(int arr [],int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void EvenAndOdd(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left<right){
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0){
                left++;
            }
            if (arr[right] %2 == 1){
                right --;
            }
        }
    }
    static void print(int arr []){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5,6,7,8,9};
        EvenAndOdd(myArray);
        print(myArray);
    }
}
