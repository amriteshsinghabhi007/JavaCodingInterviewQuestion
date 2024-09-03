package work;

public class demo {
    public static void main(String[] args) {
        String[] arr = {"AMRITESH","AMRI"};
        int l = arr.length;
        int n = Math.floorDiv(l,2); 
        String temp;
        for(int i=0; i<n;i++){
            temp = arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(String ele : arr){
            System.out.println(ele+ " ");
        }
    }
}
