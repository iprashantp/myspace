package Synchronization;

public class Classes {

	public static void main(String[] args) {

		ThreadSync obj=new ThreadSync();
		Thread t1=new Thread(){
			public void run(){
				obj.Printer(1, 100);
			}
		};
		Thread t2=new Thread(){
			public void run(){
				obj.Printer(101, 200);
			}
		};
		t1.start();
		t2.start();
	}

}
