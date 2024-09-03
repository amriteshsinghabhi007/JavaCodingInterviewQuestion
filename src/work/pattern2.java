package work;

public class pattern2 {
    public static void main(String arg[]){

        int row = 5;
        int col = 6;
        for (int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || j==1 || i==row || j == col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
