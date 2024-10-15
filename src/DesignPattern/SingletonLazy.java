package DesignPattern;

public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){

    }
    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonLazy instance = SingletonLazy.getInstance();
        System.out.println(instance);
        SingletonLazy instance1 = SingletonLazy.getInstance();
        System.out.println(instance1);
    }
}
