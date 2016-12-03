package Final;

public class Class2{
	final int a;
	final static int b=0;
	//final variable can only be initialized in constructor
	Class2(){
		a=2;
	}
	public static void main(String []args){
		Class2 obj=new Class2();
	}

}
