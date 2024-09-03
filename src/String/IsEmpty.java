package String;

public class IsEmpty {
    public static void main(String[] args) {
        String str = "";
        String str1 = "Amritesh";
        String str2 = null;
        System.out.println(str.isEmpty());
        System.out.println(str1.isEmpty());

        if(str2 == null) {
            System.out.println("the string is null"); // use == operator to avoid the issue
        }
        System.out.println(str2.isEmpty()); // error java.lang.NullPointerException
    }
}
