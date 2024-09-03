package Super;
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{

    void eat() {
        System.out.println("Eating food");
    }
    void bark(){
        System.out.println("Dog Barking");
    }
    void work(){
        bark();
        eat();
        super.eat();
    }
}
public class Supermethod {
    public static void main(String[] args) {
      Dog d = new Dog();
      d.work();
    }
}
