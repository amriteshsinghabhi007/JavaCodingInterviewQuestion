package Super;

class A{
   String color = "black";
}
class B extends A{
    String color = "White";
   void show(){
       System.out.println(super.color);
       System.out.println(color);
   }
}
public class Superntanceariable {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
