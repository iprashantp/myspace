package multithreading;

public class ThreadDefineWaysDemo {
    public static void main(String[] args) {
        MyThreadWays t = new MyThreadWays();
        Thread t1 = new Thread(t);
        t1.start();
        System.out.println("This is MAIN thread: "+Thread.currentThread().getName());
    }
}

class MyThreadWays extends Thread{
    public void run(){
        System.out.println("MyThreadWays child");
        System.out.println("This is thread: "+Thread.currentThread().getName());
    }
}

