package Adobe;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if (substring(s1, s2))
			System.out.println("yes");
		else
			System.out.println("no");
	}

	//return true if s1 is substring of s2
	public static boolean substring(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		char[]c1=s1.toCharArray();
		char[]c2=s2.toCharArray();
		int i,j;
		for (i = 0,j=0; i < l1 && j<l2; i++) {
			if(c1[i]==c2[j]){
				j++;
			}
			else
				j=0;
		}
		if(j==l2)
			return true;
		return false;
	}

}
