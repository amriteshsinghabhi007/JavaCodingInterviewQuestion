package String;

public class split {
    public static void main(String[] args) {
        //5109642509
        String s1 = "amritesh is good boy";
        String words[] = s1.split("\\s");
        for ( String w : words){
            System.out.println(w);
        }
    }
}
