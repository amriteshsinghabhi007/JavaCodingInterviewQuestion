package DSA.Array;
//i/p - {1,2,-3,4,5,-6,-7}
//o/p - {49 36 25 16 9 4 1 }
public class AbsoluteValueSortArrayWithTheirsqual {
    static int[] sortSquare(int[] arr){
        int n = arr.length;
        int [] ans = new int[n];
        int left = 0; int right = n-1;
        int k = 0;
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left]*arr[left];
                left++;
            }
            else {
                ans[k++] = arr[right]*arr[right];
                right--;
            }
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
        int [] myArray = {1,2,-3,4,5,-6,-7};
        int [] sortedValue = sortSquare(myArray);
        print(sortedValue);
    }
}

