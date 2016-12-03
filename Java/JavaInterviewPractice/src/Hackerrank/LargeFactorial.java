package Hackerrank;

public class LargeFactorial {
	private int arrsize;

	public static void main(String[] args) {
		LargeFactorial obj=new LargeFactorial();
		obj.getFact(25);
	}
	private int[]getFact(int n){
		arrsize=1;
		int[] result=new int[1000];
		result[0]=1;
		if(n<=1) return result;
		for(int i=2;i<=n;i++){
			result=multiply(result,i);
		}
		for(int i=arrsize-1;i>=0;i--)
			System.out.print(result[i]);
		return result;
	}
	private int[]multiply(int[]result,int n){
		int carry=0;
		int mul;
		int i;
		for(i=0;i<arrsize;i++){
			mul=carry+result[i]*n;
			result[i]=mul%10;
			carry=mul/10;
		}
		while(carry!=0){
			result[i++]=carry%10;
			carry=carry/10;
			arrsize++;
		}
		return result;
	}

}
