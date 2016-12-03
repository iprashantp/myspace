package MAQ;

public class Factorial {

	public static void main(String[] args) {
		Fact(6);
	}
	private static void Fact(int n){
		if(n<=1){
			System.out.println("1");
			return;
		}
		int[]arr=new int[1000];
		int digits=1;
		arr[0]=1;
		for(int i=2;i<=n;i++){
			digits=Multiplication(arr,i,digits);
		}
		for(int i=digits-1;i>=0;i--)
			System.out.print(arr[i]);
	}
	private static int Multiplication(int[]arr,int x,int digits){
		int carry=0;
		int prod=0;
		for(int i=0;i<digits;i++){
			prod=arr[i]*x+carry;
			arr[i]=prod%10;
			carry=prod/10;
		}
		while(carry!=0){
			arr[digits]=carry%10;
			carry=carry/10;
			digits++;
		}
		return digits;
	}
}
