package Synchronization;

public class ThreadSync extends Thread{

	public synchronized void Printer(int i,int j){
		for(int k=i;k<=j;k++)
			System.out.println(k);
	}

}
