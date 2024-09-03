package Interface;

interface Drawable1{
    void show();
    static int cube(int x){
        return x*x*x;
    }
    }
class Rectangle1 implements Drawable1{

    public void show() {
        System.out.println("Class Rectangle");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Drawable1 d = new Rectangle1();
        d.show();
        System.out.println(Drawable1.cube(10));
    }
}
