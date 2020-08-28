package Synchronization;

public class PrintEvenOdd {
	public static void main(String args[]) {
		UtilityClass uc1 = new UtilityClass();
		//UtilityClass uc2 = new UtilityClass();
		
		MyThreadClass mtc1 = new MyThreadClass(uc1,true);
		MyThreadClass mtc2 = new MyThreadClass(uc1,false);
		
		Thread obj1 = new Thread(mtc1,"EThread");
		Thread obj2 = new Thread(mtc2,"OThread");
		
		obj1.start();
		obj2.start();
	}

}

class MyThreadClass implements Runnable{
	boolean even;
	UtilityClass utility;
	
	public MyThreadClass(UtilityClass obj,boolean even) {
		this.utility = obj;
		this.even=even;
	}
	
	@Override
	public void run() {
		//System.out.println("in run for : "+this.utility.id);
		int num = even==true? 2:1;
		while(num<=20) {
			//System.out.println("iteration: "+iter++);
			if(even==true) 
				utility.printEven(num);
			else 
				utility.printOdd(num);
			num+=2;
		}
	}
}

class UtilityClass{
	boolean isEven;
	
	public UtilityClass() {
		this.isEven=false;
	}
	
	public synchronized void printEven(int num) {
		while(!isEven) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+num);
		isEven=false;
		notify();
	}
	
	public synchronized void printOdd(int num) {
		while(isEven) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+num);
		isEven=true;
		notify();
		
	}
}