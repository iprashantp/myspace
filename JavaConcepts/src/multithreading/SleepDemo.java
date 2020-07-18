package multithreading;

public class SleepDemo {
    public static void main(String[] args) {
        SleepDemo obj = new SleepDemo();
        //obj.SleepDemoMethod();
        obj.threadInterruptionDemo();
    }

    public void SleepDemoMethod(){
        for(int i=0;i<10;i++){
            System.out.println("iteration "+i);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted at "+i);
                e.printStackTrace();
            }
        }
    }

    public void threadInterruptionDemo(){
        ThreadSleepClass t = new ThreadSleepClass();
        t.start();
        t.interrupt();
    }
}

class ThreadSleepClass extends Thread{
    Thread parent;
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("ThreadSleepClass iteration:"+i);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("ThreadSleepClass got interrupted at:"+i);
                e.printStackTrace();
            }
        }
    }
}