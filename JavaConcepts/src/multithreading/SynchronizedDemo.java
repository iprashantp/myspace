package multithreading;

/**
 * this class is for demonstrating the non synchronized behavior
 */
public class SynchronizedDemo {
    public static void main(String[] args) {
        SynchronizedDemo obj = new SynchronizedDemo();
        //obj.example1();
        obj.example2();
    }
    public void example1(){
        Dummy d1 = new Dummy();
        Dummy d2 = new Dummy();
        SyncThread t1 = new SyncThread(d1,"prashant");
        SyncThread t2 = new SyncThread(d2,"mona");
        t1.start();
        t2.start();
    }
    public void example2(){
        Display d1 = new Display();
        Display d2 = new Display();
        DisplayThread1 t1 = new DisplayThread1(d1);
        DisplayThread2 t2 = new DisplayThread2(d1);
        t1.start();
        t2.start();
    }
}

class DisplayThread1 extends Thread{
    Display d;
    DisplayThread1(Display d){
        this.d = d;
    }
    public void run(){
        d.displayn();
    }
}

class DisplayThread2 extends Thread{
    Display d;
    DisplayThread2(Display d){
        this.d = d;
    }
    public void run(){
        d.displayc();
    }
}

class Display{
    public  void displayn(){
        for(int i=0;i<5;i++){
            System.out.print(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public  void displayc(){
        for(int i=65;i<70;i++){
            System.out.print((char)i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



class SyncThread extends Thread{
    Dummy d;
    String name;
    public SyncThread(Dummy d,String name){
        this.d = d;
        this.name = name;
    }
    public void run(){
        d.printer(name);
    }
}

class Dummy{
    public void printer(String name){
        for(int i=0;i<5;i++){
            System.out.print("Hello ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}