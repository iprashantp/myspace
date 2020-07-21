package multithreading;

public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        InterThreadCommunication obj = new InterThreadCommunication();
        obj.threadCommunication1();
    }
    public void threadCommunication1() throws InterruptedException {
        ITCDemo t1 = new ITCDemo();
        t1.start();
        synchronized (t1){
            System.out.println("Main thread trying to call wait method");//---1
            t1.wait();
            System.out.println("Main method got notified from child thread");//---4
            System.out.println(t1.total);//---5
        }
    }
}

class ITCDemo extends Thread {
    int total;
    ITCDemo(){
        this.total=0;
    }
    public void run(){
        synchronized (this){
            System.out.println("child thread starts calculation");//---2
            for(int i=0;i<=100;i++) total+=i;
            System.out.println("child thread trying to give notification");//---3
            this.notify();
        }
    }
}