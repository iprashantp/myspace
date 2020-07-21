package multithreading;

public class DeadlockDemo extends Thread{
    DClassA a = new DClassA();
    DClassB b = new DClassB();

    public void m1(){
        this.start();
        a.d1(b); //Main thread execute this
    }
    public void run(){
        b.d2(a); //child thread execute this
    }

    public static void main(String[] args) {
        DeadlockDemo d = new DeadlockDemo();
        d.m1();
    }
}

class DClassA {
    public synchronized void d1(DClassB b){
        System.out.println("Thread1 starts execution of A.d1()");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread1 trying to call B.last()");
        b.last();
    }
    public synchronized void last(){
        System.out.println("Inside A, this is last() method of A");
    }
}

class DClassB {
    public synchronized void d2(DClassA a){
        System.out.println("Thread2 starts execution of B.d2()");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread2 trying to call A.last()");
        a.last();
    }
    public synchronized void last(){
        System.out.println("Inside B, this is last() method of B");
    }
}