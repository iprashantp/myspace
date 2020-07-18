package multithreading;

public class ThreadJoin {
    public static void main(String[] args) {
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        ThreadJoinDemo1 t2 = new ThreadJoinDemo1();
        t1.start();
        try {
            t1.join();
            for(int i=0;i<5;i++){
                System.out.println("Main t1 thread");
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
        t2.start();
        try {
            t2.join();
            for(int i=0;i<5;i++){
                System.out.println("Main t2 thread");
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
    }


}
class ThreadJoinDemo extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("child ThreadJoinDemo thread");
        }
    }
}
class ThreadJoinDemo1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("child ThreadJoinDemo1 thread");
        }
    }
}