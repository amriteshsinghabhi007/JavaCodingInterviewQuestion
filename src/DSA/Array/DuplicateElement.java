package DSA.Array;

import java.util.Arrays;

//Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)
//Example
//removeDuplicates({1, 1, 2, 2, 3, 4, 5})
//Output : [1, 2, 3, 4, 5]
public class DuplicateElement {
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int [] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                result[index++] = arr[i];
            }
        }
        return Arrays.copyOf(result,index);
    }

    public static void main(String[] args) {
        int [] myArray = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates(myArray)));
    }
}
