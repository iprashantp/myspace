import java.util.ArrayList;

public class AllPalindromes {
	
	public static void main(String[] args) {
		// palindromes("abaaa");
		printAllPalindromes("dskjkd");
		return;
	}

	static int max(int a, int b) {
		if (a > b)
			return a;
		return b;
	}

	static int min(int a, int b) {
		if (a < b)
			return a;
		return b;
	}

	public static void printAllPalindromes(String inputText) {
		if (inputText == null) {
			System.out.println("Input cannot be null!");
			return;
		}
		ArrayList<Character>hs=new ArrayList<Character>();
		
		// ODD Occuring Palindromes
		int len = inputText.length();
		for(int i=0;i<len;i++){
			hs.add(inputText.charAt(i));
		}
		int palindromCounter =0;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i - 1, k = i + 1; j >= 0 && k < len; j--, k++) {
				if (inputText.charAt(j) == inputText.charAt(k)){
					System.out.println(inputText.subSequence(j, k + 1));
					palindromCounter++;
				}
				else
					break;
			}
		}
		// EVEN Occuring Palindromes
		for (int i = 0; i < len - 1; i++) {
			for (int j = i, k = i + 1; j >= 0 && k < len; j--, k++) {
				if (inputText.charAt(j) == inputText.charAt(k)){
					System.out.println(inputText.subSequence(j, k + 1));
					palindromCounter++;
				}
				else
					break;
			}
		}
System.out.println(palindromCounter+hs.size());
	}
}
