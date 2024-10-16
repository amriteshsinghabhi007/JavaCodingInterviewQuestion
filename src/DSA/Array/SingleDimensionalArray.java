package DSA.Array;

public class SingleDimensionalArray {
    int arr [] = null;

    //constructor for get the size of array
    public SingleDimensionalArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i = 0; i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    //insert the value in array
    public void insert(int location,int valueToBeUpdate){

        try {
            if (arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeUpdate;
                System.out.println("Inserted array successfully");
            }
            else {
                System.out.println("This cell is occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Out of Bound");
        }
    }
    //Travers the value in array
    public void traversal(){
        for (int i = 0; i<arr.length;i++){
            System.out.println("Traversal value : " +arr[i]);
        }
    }
    //search the value in array
    public void searchInArray(int valueToSearch){
        for (int i =0;i<arr.length;i++){
            if(arr[i] == valueToSearch){
                System.out.println("Found the value : " +i);
                return;
            }
        }
        System.out.println(valueToSearch+ " is not found");
    }
    //Delete the value in array
    public void deleteInArray(int deleteValueIndex){
        try {
            arr[deleteValueIndex] = Integer.MIN_VALUE;
            System.out.println("value is deleted");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value is that provided is not the range of Array");
        }
    }

    public static void main(String[] args) {
        SingleDimensionalArray obj = new SingleDimensionalArray(10);
        System.out.println("*****insert*****");
        obj.insert(0,1);
        obj.insert(1,2);
        obj.insert(2,3);
        obj.insert(1,5);
        obj.insert(11,12);

        //Accessing the index value
        System.out.println("*****Accessing the value*****");
        int firstvalue = obj.arr[1];
        System.out.println("First value : " +firstvalue);
        int secondvalue = obj.arr[2];
        System.out.println("First value : " +secondvalue);

        //Traversal the value of array
        System.out.println("*****traversal*****");
        obj.traversal();

        //Search value in array
        System.out.println("*****searchInArray*****");
        obj.searchInArray(1);
        obj.searchInArray(10);

        //Delete the value in array
        System.out.println("*******deleteInArray*******");
        obj.deleteInArray(0);
        System.out.println(obj.arr[0]);
    }
}
