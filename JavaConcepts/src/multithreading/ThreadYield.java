package multithreading;

public class ThreadYield {
    public static void main(String[] args) {
        YieldThreadDemo t = new YieldThreadDemo();
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
class YieldThreadDemo extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
