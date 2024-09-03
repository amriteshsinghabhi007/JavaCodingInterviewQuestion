package Super;

class Animal1{
    Animal1(){
        System.out.println("The animal");
    }
}
class Dog1 extends Animal1{
    Dog1(){
        super();
        System.out.println("Dog");

    }
}
public class superconstructor {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
    }
}
