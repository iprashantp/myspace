package Adobe;

public class ReccursiveMultiplication {

	public static void main(String[] args) {
		ReccursiveMultiplication obj = new ReccursiveMultiplication();
		int a=5,b=9;
		System.out.println(obj.multiply(a,b));
	}
	private int multiply(int a,int b){
		if(b>0)
			return a+multiply(a,b-1);
		else if(b<0) 
			return -multiply(a,-b);
		return 0;
	}

}
