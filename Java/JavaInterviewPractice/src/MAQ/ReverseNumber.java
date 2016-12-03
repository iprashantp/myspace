package MAQ;

//using reccursion
public class ReverseNumber {

	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		int n = 5678;
		System.out.println(obj.reverse(n));
	}

	private int reverse(int number) {
		int[] arr = new int[100];
		int index = recreverse(number, arr, 0);

		number = 0;
		for (int i = 0; i < index; i++)
			number = number * 10 + arr[i];

		return number;
	}

	private int recreverse(int n, int[] arr, int index) {
		if (n != 0) {
			arr[index] = n % 10;
			n = n / 10;
			index=recreverse(n,arr,index+1);
		}
		return index;
	}

}
