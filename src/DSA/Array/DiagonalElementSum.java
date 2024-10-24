package DSA.Array;

//2D Arrays
//Given 2D array calculate the sum of diagonal elements.
//myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
// Result :- sumDiagonalElements(myArray2D) # 15
public class DiagonalElementSum {
    public static int sumDiagonalElements(int[][] array) {

        int sum =0;
        int rows = array.length;
        int cols = rows;

        for(int i = 0 ;i< rows ; i++){
            for(int j = 0 ; j<cols;j++)
                if (i ==j ) {
                    sum = sum + array[i][j];
                }
            }
        return sum;
    }
    public static void main(String[] args) {
        int[][] input_matrix = {
                { 1, 2, 3, 7},
                { 4, 5, 6 ,7},
                { 7, 8, 9,10},
                { 7, 8, 9,11}
        };
        System.out.println(sumDiagonalElements(input_matrix));
    }
}
