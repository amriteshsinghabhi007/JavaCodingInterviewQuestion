package Static;

class Counter{
    static int count = 0;
    Counter(){
        count ++;
        System.out.println("Count- "+ count);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
