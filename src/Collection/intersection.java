package Collection;

import java.util.HashSet;

public class intersection {
    public static int intersectionnumber(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j = 0; j<arr1.length; j++){
            if(set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,4,5,6,7,8,5,4,3};
        System.out.println(intersectionnumber(arr1,arr2));
    }
}
