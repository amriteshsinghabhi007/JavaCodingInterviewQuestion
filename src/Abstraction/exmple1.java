package Abstraction;

abstract class Shape{
    abstract void draw();
}
class circle extends Shape{
    void draw(){
        System.out.println("Circle");
        }
}
class retangle extends Shape{
    void draw() {
        System.out.println("retangle");
    }
}
public class exmple1 {
    public static void main(String[] args) {
     Shape s = new circle();
     s.draw();
     Shape s1 = new retangle();
     s1.draw();
    }
}
