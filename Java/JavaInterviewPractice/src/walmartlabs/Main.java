package walmartlabs;

import java.util.HashMap;
/**
 * Q1. Given n strings consisting of ‘R’ and ‘B’. 
 * Two strings can be only combined if last character of first string 
 * and first character of second string are same Given n strings, 
 * you have to output the maximum length possible by combining strings.
 *  
 * Q2.Find the maximum digit occurred in a range of prime numbers 
 * Eg: Range ( 21 -40) –>Prime numbers are 23,29,31,37,39
 * ( 2 occurs 2 times, 3 occurs 4 times, 1 and 7 occur 1 time and 9 occurs 2 times
 *  ->Answer is 3).
 * 
 * Q3. In how many ways a number N can be represented as a+b+c+d such that
 * 1<=a<=b<=c<=d<=5000, 1<=N<=5000
 * 
 * @author prashant
 *
 */
public class Main {

	public static void main(String[] args) {
		Main obj=new Main();
		//System.out.println(obj.combinations(10, 2));
		//System.out.println(obj.begger(6));
		System.out.println(obj.freqCount(31, 57));
	}
	//Time Limit Exceed
	private int begger(int n){
		int counter=0;
		int i,j = 1,k = 1,l = 1;
		for(i=1;i<=j;i++){
			for(j=i;j<=k;j++){
				for(k=j;k<=l;k++){
					l=n-(i+j+k);
					if(l>=k){
						System.out.println(i+" "+j+" "+k+" "+l);
						counter++;
					}
				}
			}
		}
		return counter;
	}
	int combinations(int n, int k){
	    int res = 1;
	 
	    // nCk = nCn-k
	    if ( k > n - k )
	        k = n - k;
	 
	    // Calculate value of [n * (n-1) *---* (n-k+1)] / [k * (k-1) *----* 1]
	    for (int i = 0; i < k; ++i)
	    {
	        res *= (n - i);
	        res /= (i + 1);
	    }
	 
	    return res;
	}
	//Time Limit Exceed
	private int freqCount(int l,int r){
		int flag=0,maxkey=0,maxval=0,tempkey,tempval;
		boolean prime=false;
		if(r<2) return maxkey;
		HashMap<Integer,Integer>freqMap=new HashMap<Integer,Integer>();
		//initialize
		for(int i=0;i<10;i++)
			freqMap.put(i, 0);
		
		for(int i=l;i<=r;i++){
			flag=0;
			int x=(int)Math.sqrt(i);
			for(int j=2;j<=x;j++){
				if(i%j==0){
					flag=1;
					break;
				}
			}
			// its prime number
			if(flag==0){
				prime=true;
				int temp=i;
				while(temp!=0){
					tempkey=temp%10;
					tempval=freqMap.get(tempkey);
					freqMap.put(tempkey, 1+tempval);
					
					if(1+tempval>maxval){
						maxval=1+tempval;
						maxkey=tempkey;
					}
					else if(1+tempval==maxval && tempkey>maxkey)
						maxkey=tempkey;
					temp=temp/10;
				}
			}
		}
		if(prime==false) return -1;
		
		return maxkey;
	}

}
