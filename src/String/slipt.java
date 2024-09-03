package String;

import java.sql.SQLOutput;

public class slipt {
    public static void main(String[] args) {
        String str = "Amritesh or floor";
        String str1 = str.replace("or","OR").replace("Or","OR").replace("oR","OR");
        if(str1.indexOf("OR")>0){
            String[] conditions = str1.split("OR");
            String text = "";
            for(int i=0; i<= conditions.length-1; i++){
                if(i == conditions.length-1){
                    text = text + "("+conditions[i]+ ")";
                }
                else{
                    text = text + "(" +conditions[i]+") OR";
                }
                System.out.println(text.replaceAll("\\s", ""));
            }
        }
    }
}
