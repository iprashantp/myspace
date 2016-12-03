
class Inheritance {
	
	public static void main(String args[]){
		Inheritance inh=new Inheritance();
		A obj=new A();
		
		obj.a=7;
		inh.function(obj);
		
		int i=1;
		inh.function(i);
		
		Integer j=new Integer(10);
		inh.function(j);
		Integer k=inh.function(j);
		
		//String s= new String("string");
		String s="string";
		inh.functionC(s);
		
		/*D d=new D();
		d.a=50;//d.b=51;
		inh.function(d);*/
		
		Integer x=new Integer(10); x++;
		
		//D d=new D(10); d++;
		
		System.out.println(obj.a+" "+i+" "+j+" "+k+" "+s);
	}
	private void function(D d){
		//d=d+1;
		
	}
	private void functionC(String s){
		s.concat("con");
	}
	private void function(A ob){
		ob.a++;
	}
	private void function(int a){
		a++;
	}
	private Integer function(Integer a){
		a++;
		return a;
	}
	
}
class D{
	Integer a;
	//int b;
	D(Integer a){
		this.a=a;
	}
}
class A{
	int a;
	
	private void function() {
		System.out.println("in A");
	}
}
class B extends A{
	public void function(){
		System.out.println("in B");
	}
}