package multithreading;

public class RunnableDemo {
    public static void main(String[] args) {
        MyThreadRunable r = new MyThreadRunable();
        Thread t = new Thread(r);
        t.start();
    }
}

class MyThreadRunable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("child thread"+i);
        }
    }
}