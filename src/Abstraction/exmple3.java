package Abstraction;

abstract class Bike {
    Bike() {
        System.out.println("Bike Created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("Gear changed");
    }
}
class Honda extends Bike{
    void run() {
        System.out.println("Bike is running");
    }
}
public class exmple3 {
    public static void main(String[] args) {
        Bike b = new Honda();
        b.run();
        b.changeGear();
    }

}
