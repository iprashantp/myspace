package Adobe;

public class BoyerMoore {

	public static void main(String[] args) {
		BoyerMoore obj=new BoyerMoore();
		String str = "xajlsdkfjasldkfasleiehtfzg haksneflkn we o irhosbed fiuqgw hwoeiytiuwsehtfzm xvcn";
		String pattern = "ehtfz";
		obj.Search(str,pattern);
	}
	private void Search(String str, String pattern){
		int slen=str.length();
		int plen=pattern.length();
		char[] schar=str.toCharArray();
		char[] pchar=pattern.toCharArray();
		int[]badchar=new int[256];
		
		initialize(badchar,plen,pchar);
		int shift=0,j;
		while(shift<=slen-plen){
			j=plen-1;
			while(j>=0 && pchar[j]==schar[shift+j]) j--;
			//pattern matched
			if(j<0){
				System.out.println("pattern matched at index: "+(shift+j));
				shift+=(shift+plen<slen)?plen-badchar[schar[shift+plen]]:1;
			}
			else{
				shift+=max(1,j-badchar[schar[shift+j]]);
			}
		}
	}
	private int max(int a,int b){
		if(a>b)return a;
		return b;
	}
	private void initialize(int[]badchar,int len,char[]pattern){
		for(int i=0;i<256;i++)
			badchar[i]=-1;
		for(int i=0;i<len;i++)
			badchar[pattern[i]]=i;
	}

}
