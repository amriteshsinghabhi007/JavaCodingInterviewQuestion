// To invoke the current class method
package This;
class A{
    void m(){
        System.out.println("Class M");
    }
    void n(){
        System.out.println("Class N");
        this.m();
    }
}
public class InvokeCurrentClassMethod {
    public static void main(String[] args) {
       A a = new A();
       a.n();
    }
}
