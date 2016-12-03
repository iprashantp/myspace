package zemoso;

import java.util.Arrays;

class Seq {

	public static void main(String[] args) {
		Seq obj=new Seq();
		int n=10;
		obj.solution(n);
	}
	private int solution(int n){
		int arr[]=populate();
		return arr[n];
	}
	private int[] populate(){
		int sum,p,q;
		int[] result=new int[201];
		int index=0;
		for(sum=0;sum<=20 && index<=200;sum++){
			for(p=0;p<=sum;p++){
				q=sum-p;
				result[index++]=((int) Math.pow(2, p))*((int)Math.pow(3, q));
				if(index>=200)
					break;
			}
		}
		Arrays.sort(result);
		return result;
	}

}
