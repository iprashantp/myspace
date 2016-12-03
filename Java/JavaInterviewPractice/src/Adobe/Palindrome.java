package Adobe;

public class Palindrome {
	public static void main(String []args){
		String s = "aabd2aa";
		int n = 0;
		if(palindrome(n))
			System.out.println("yes");
		else 
			System.out.println("nope");
	}
	static boolean palindrome(String s){
		char[] carr = s.toCharArray();
		int left=0,right=s.length()-1;
		while(left<right){
			if(carr[left]==carr[right]){
				left++;
				right--;
			}
			else
				return false;
		}
		return true;
	}
	static boolean palindrome(int n){
		int rem=0;
		int rev=0;
		int temp=n;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev)
			return true;
		return false;
	}

}
