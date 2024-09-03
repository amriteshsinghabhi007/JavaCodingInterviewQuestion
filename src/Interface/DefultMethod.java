package Interface;

interface Drawable{
    void show();
    default void msg(){
        System.out.println("Default method");
    }
}
class Rectangle implements Drawable{

    public void show() {
        System.out.println("Class Rectangle");
    }
}
public class DefultMethod {
    public static void main(String[] args) {
        Drawable d = new Rectangle();
        d.msg();
        d.show();
    }
}
