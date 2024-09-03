package work;

public class Static {
    int age;
    String name;
    static String Collage = "MCA";

    Static (int a, String n){
        age = a;
        name = n;
    }
    void display(){
        System.out.println(name+" "+age+" "+" "+Collage);
    }
    public static void main(String args[]){
        Static s1 = new Static(26,"Amritesh");
        Static s2 = new Static(24,"Diti");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
        s1.display();
        s2.display();
    }
}

