package work;

import java.time.Duration;

public class Thread1 {
    public static void main(String [] arg){

        Runnable thread1 = () -> {

            for (int i =1;i<=10;i++){
                System.out.println("The value of i is :-" + i);
                try {
                    Thread.sleep(Duration.ofMillis(1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread = new Thread(thread1);
        thread.setName("Amritesh");
        thread.start();
    }}

