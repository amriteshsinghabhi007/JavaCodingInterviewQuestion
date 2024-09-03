package work;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

//        step 1:-
        myInter MyInter = new MyInterImp();
        MyInter.SayHello();

//        step2

        myInter i = new myInter() {
            @Override
            public void SayHello() {
                System.out.println("my frist interface");
            }

        };
        i.SayHello();
        myInter i2 = new myInter() {
            @Override
            public void SayHello() {
                System.out.println("my second interface");
            }

        };
        i2.SayHello();

//        step3
        myInter i3 =()-> System.out.println("my second lambda");
        i3.SayHello();

//        step4
        MySum mySum = (int a, int b)->{
            return a+b;
        };
        System.out.println(mySum.sum(20,10));
        System.out.println(mySum.sum(40,10));
    }
}