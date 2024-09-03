package String;

public class EqualsMethod {
    public static void main(String[] args) {
        //Equals class
        String s1 = "Amritesh";
        String s2 = "Amritesh";
        String s3 = new String("Amritesh");
        String s4 = "Singh";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s2));
        System.out.println(s3.equals(s4));

        //Equals ignore case
        String s5 = "Amritesh";
        String s6 = "AMRITESH";
        System.out.println(s5.equalsIgnoreCase(s6));

        //compareTo()
        String s7 = "amritesh";
        String s8 = "amritesh";
        String s9 = new String("Singh");
        System.out.println(s7.compareTo(s8));
        System.out.println(s7.compareTo(s9));
        System.out.println(s9.compareTo(s7));
    }
}
