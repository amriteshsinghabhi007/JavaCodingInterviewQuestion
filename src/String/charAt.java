package String;

public class charAt {
    public static void main(String[] args) {
        // odd position char print
        String str = "welcome to the java world";
        int count=0;
        for(int i = 0; i<= str.length()-1;i++){
            if(i%2!=0){
                System.out.println("char at " +i+ " place " +str.charAt(i));
            }
        }
        for(int j = 0; j<= str.length()-1;j++) {
            if (str.charAt(j) == 'o') {
                count++;
            }
        }
        System.out.println("Number of o: " + count);
    }
}
