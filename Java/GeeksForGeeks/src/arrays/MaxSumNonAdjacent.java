package arrays;

public class MaxSumNonAdjacent {

	public static void main(String[] args) {
		int arr[] = { 5, 7, 1, 4, 10/*, 44, 9, 13, 8, 11, 0, 20*/ };
		int arraylength = 0;
		for (int element : arr) {
			arraylength++;
		}
		int maxsum = MaxSum(arr, arraylength);
		System.out.println("max sum: " + maxsum);

	}

	private static int MaxSum(int[] arr, int arraylength) {
		if (arraylength <= 0) {
			System.out.println("empty array");
			return 0;
		}
		int incl = arr[0];
		int excl = 0;
		int newexcl = 0;
		for (int i = 1; i < arraylength; i++) {
			newexcl = max(incl, excl);
			incl = arr[i] + excl;
			excl = newexcl;
		}
		return max(incl, excl);
	}

	private static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

}
