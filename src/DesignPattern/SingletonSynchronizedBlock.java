package DesignPattern;

public class SingletonSynchronizedBlock {
    private static SingletonSynchronizedBlock instance;
    private SingletonSynchronizedBlock(){}
    public static SingletonSynchronizedBlock getInstance(){
        if(instance == null){
            synchronized (SingletonSynchronizedBlock.class){
                if(instance == null){
                    instance = new SingletonSynchronizedBlock();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonSynchronizedBlock instance = SingletonSynchronizedBlock.getInstance();
        System.out.println(instance);
        SingletonSynchronizedBlock instance1 = SingletonSynchronizedBlock.getInstance();
        System.out.println(instance1);
    }
}
