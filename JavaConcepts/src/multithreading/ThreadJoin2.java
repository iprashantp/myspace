package multithreading;

public class ThreadJoin2 {
    public static void main(String[] args) {
        ThreadParent p = new ThreadParent();
        p.main();
    }
}

class ThreadParent{
    public void main(){
        ThreadJoinChildDemo1 t1 = new ThreadJoinChildDemo1();
        t1.parent = Thread.currentThread(); //assigned the parent thread to the caller object
        t1.start();
        //uncomment below To make current thread to wait for the child to complete
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for(int i=0;i<10;i++){
            System.out.println("ThreadParent");
        }
    }
}
class ThreadJoinChildDemo1 extends Thread{
    Thread parent;
    public void run(){
        //uncomment below to make current thread to wait for the parent one to complete
        try {
            parent.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<10;i++){
            System.out.println("ThreadJoinChildDemo1");
        }
    }
}
