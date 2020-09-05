package oops;

public class Abstraction extends abstractClassA{
	public static void main(String [] args) {
		Abstraction obj = new Abstraction();
//		obj.printer();
		interfaceA.getNumber();
		obj.getAbsNum();
	}

//	@Override
//	public void printer() {
//		System.out.println("implementation of imterfaceA method");
//	}

	@Override
	public void getAbsNum() {
		System.out.println(absNum);
	}
	

}

interface interfaceA{
	public static final int a = 0;
	public void printer();
	public static void getNumber() {
		System.out.println("static interface Method");
	}
	public default void defaultMethod() {
		System.out.println("default method of interface");
	}
}

abstract class abstractClassA{
	int absNum;
	public abstract void getAbsNum();
}