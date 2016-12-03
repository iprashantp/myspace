package Adobe;

import java.util.Scanner;

public class NumberWithAllOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(getNumber(n));
		return;
	}
	public static int getNumber(int n){
		int number=0;
		do{
			number=number*10+1;
		}while(number%n!=0);
		return number;
	}
}
