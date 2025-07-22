package Multithreading;

public class Multithreading {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i=0;i<10;i++){
                System.out.println("Thread 1 exexcuting iteration: "+ i);
            }
        });
        Thread t2 = new Thread(()->{

            try{
                t1.join();
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
            for (int i=0;i<10;i++){
                System.out.println("Thread 2 exexcuting iteration: "+ i);
                Thread.yield();
            }
        });
        t1.start();
        t2.start();
    }
}
