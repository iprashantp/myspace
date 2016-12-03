public class OuterClass {
	 
	public static void main(String[] args) {
		OuterClass obj=new OuterClass();
		obj.access();
	}
	 private void access(){
		 InnerClass ob=new InnerClass();
		 ob.fun();
	 }
	private static void printer(){
		System.out.println("print");
	}
	
	
	class InnerClass{
		public  void fun(){
			System.out.println("inner class");
			printer();
		}
	}

}

class AnotherClass{
	public static void main(String[]args){
		OuterClass outerClass=new OuterClass();
		OuterClass.InnerClass ob=outerClass.new InnerClass();
		ob.fun();
	}
}
