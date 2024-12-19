package DesignPattern;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager(); // eager intitialisation
    private SingletonEager(){

    }

    public static SingletonEager getInstance() {

        return instance;
    }

    public static void main(String[] args) {
        SingletonEager instance = SingletonEager.getInstance();
        System.out.println(instance);
        SingletonEager instance1 = SingletonEager.getInstance();
        System.out.println(instance1);
    }
}
