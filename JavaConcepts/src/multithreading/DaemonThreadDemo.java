package multithreading;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        DaemonThreadDemo obj = new DaemonThreadDemo();
        obj.daemonDemo();
    }
    //non daemon thread will end once all daemon threads end
    private void daemonDemo(){
        MyDThread t = new MyDThread();
        t.setDaemon(true);
        t.start();
        System.out.println("End of main thread");
    }
    //daemon thread will run even if main ends
    private void nonDaemonDemo(){
        MyDThread t = new MyDThread();
        t.start();
        System.out.println("End of main thread");
    }
}

class MyDThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i+" child thread");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){ e.printStackTrace();}
        }
    }
}