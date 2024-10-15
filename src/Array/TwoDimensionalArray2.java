package Array;

import java.util.Arrays;

public class TwoDimensionalArray2 {
    int[][] arr;

    public TwoDimensionalArray2(int numberOfRows, int numberOfCols){
        this.arr = new int [numberOfRows][numberOfCols];
        for(int rows = 0; rows<arr.length;rows++){
            for (int cols = 0; cols<arr[0].length;cols++){
                arr [rows][cols] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert2DArray(int rows, int cols, int value){
        try {
            if (arr[rows][cols] == Integer.MIN_VALUE){
                arr[rows][cols] = value;
                System.out.println("Value is successfully inserted");
            }
            else {
                System.out.println("This cell is occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D Array");
        }
    }

    public void traversal(){
        for (int rows =0;rows<arr.length;rows++){
            for (int cols = 0; cols < arr[0].length; cols++){
                System.out.println("traversal the array :- " + arr[rows][cols]);
            }
        }
    }
    public void searchInArray(int valueToSearch){
        for (int rows =0;rows<arr.length;rows++){
            for (int cols = 0; cols < arr[0].length; cols++){
                if (arr[rows][cols] == valueToSearch){
                    System.out.println("Found the value : " +arr[rows][cols]);
                    return;
                }
            }
        }
        System.out.println(valueToSearch+ " is not found");
    }
    public void deleteInArray(int deleteValueIndexrows , int deleteValueIndexcols){
        try {
            arr[deleteValueIndexrows][deleteValueIndexcols] = Integer.MIN_VALUE;
            System.out.println("value is deleted");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value is that provided is not the range of Array");
        }
    }


    public static void main(String[] args) {
        TwoDimensionalArray2 obj = new TwoDimensionalArray2(2,2);
        obj.insert2DArray(0,0,1);
        obj.insert2DArray(0,1,2);
        obj.insert2DArray(1,0,3);
        obj.insert2DArray(1,1,4);
        obj.insert2DArray(0,0,1);

        //traversal
        System.out.println("******traversal******");
        obj.traversal();

        //searchInArray
        System.out.println("******searchInArray******");
        obj.searchInArray(4);
        obj.searchInArray(5);

        //deleteInArray
        System.out.println("******deleteInArray******");
        obj.deleteInArray(0,0);
        System.out.println(obj.arr[0][0]);
    }
}
