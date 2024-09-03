package String;

public class Split1 {
    public static void main(String[] args) {
        String s = "Amritesh OR floor and Shashank or siddesh Or Manish";
//        \\s - Space calculate for OR
//        (?i)- group- case sensitive
        String [] strArr = s.split("(\\s+((?i)OR|AND))");

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<strArr.length; i++){

            sb.append(" (").append(strArr[i].trim()).append(")");
            if(strArr.length-1 != i){
                sb.append(" OR");
            }
        }
        System.out.print(sb);
    }
}
