package Abstraction;

abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest() {
        return 8;
    }
}
class PNB extends Bank{
    int getRateOfInterest() {
        return 7;
    }
}
public class exmple2 {
    public static void main(String[] args) {
    Bank b = new SBI();
    System.out.println("SBI rate of Interest- " + b.getRateOfInterest()+"%");
    b = new PNB();
    System.out.println("PNB rate of Interest - " + b.getRateOfInterest()+"%");
    }
}
