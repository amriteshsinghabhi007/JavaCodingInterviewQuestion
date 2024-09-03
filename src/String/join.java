package String;

public class join {
    public static void main(String[] args) {
        String str = String.join("+","hello","java","world");
        System.out.println(str);

        //null
        String str1 = null;
        str1 = String.join("-", null,"hello","amritesh");
        System.out.println(str1);
    }
}
