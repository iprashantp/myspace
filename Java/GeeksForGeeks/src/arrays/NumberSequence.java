package arrays;

public class NumberSequence {
	public static final int mod=1000000007;
	private long[]sc=new long[101];

	public static void main(String[] args) {
		NumberSequence obj=new NumberSequence();
		obj.fN();
		System.out.println(obj.seqGame());
	}
	private long seqGame(){
		long a=0,b = 0;
		int i=0,j=99;
		boolean iteration=true;
		while(i<j){
			if(iteration==true){
				if(sc[i]>sc[j]){
					a+=sc[i];
					i++;
				}else{
					a+=sc[j];
					j--;
				}
				iteration=false;
			}else{
				if(sc[i]>sc[j]){
					b+=sc[i];
					i++;
				}else{
					b+=sc[j];
					j--;
				}
				iteration=true;
			}
				
		}
		if(iteration==true){
			a+=sc[i];
		}
		else b+=sc[i];
		if(a>b) return a;
		return b;
	}
	private long fN(){
		long s=0;
		int i=0;
		sc[0]=0;
		while(i++<100){
			s=(mul(s)+45)%mod;
			sc[i]=s;
		}
		return s;
	}
	private long mul(long i){
		i=i*i;
		return i%mod;
	}

}
