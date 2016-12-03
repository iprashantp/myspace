package walmartlabs;

class PrintEvenOdd {

	public static void main(String[] args) {
		PrintEven t1 = new PrintEven(0);
		PrintOdd t2 = new PrintOdd(1);
		t1.run();
		t2.run();
	}

}
class Printer{
	boolean evenprinted=true;
	void printevennum(int n) throws InterruptedException{
		synchronized(this){
			if(evenprinted==false)
				wait();
			System.out.println(n);
			evenprinted=true;
			notify();
		}
	}
	void printoddnum(int n) throws InterruptedException{
		synchronized(this){
			if(evenprinted==true)
				wait();
			System.out.println(n);
			evenprinted=false;
			notify();
		}
	}
}

class PrintEven implements Runnable {
	private Printer p=new Printer();
	int start;

	public PrintEven(int n) {
		start = n;
	}


	@Override
	public void run() {
		for(int i=start;i<=20;i+=2)
			try {
				p.printevennum(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
class PrintOdd implements Runnable{
	int start;
	private Printer p=new Printer();
	public PrintOdd(int n){
		start = n;
	}
	@Override
	public void run() {
		for(int i=start;i<=20;i++)
			try {
				p.printoddnum(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
