package MAQ;

public class CommonElement {

	public static void main(String[] args) {
		CommonElement obj = new CommonElement();
		int[] arr = { 1, 4, 6, 8, 9, 11, 24 };
		int[] brr = { 2, 3, 7, 24, 31 };
		int[] crr = { 5, 24, 100 };
		int common = obj.findCommon(arr, brr, crr);
		System.out.println(common);
	}

	private int findCommon(int[] arr, int[] brr, int[] crr) {
		int i = 0, j = 0, k = 0;
		// int temp=min(arr[0],brr[0],crr[0]);
		while (i < arr.length && j < brr.length && k < crr.length) {
			int temp = max(arr[i], brr[j], crr[k]);
			if (arr[i] == brr[j] && brr[j] == crr[k])
				return arr[i];

			if (arr[i] < temp)
				i++;
			if (brr[j] < temp)
				j++;
			if (crr[k] < temp)
				k++;
		}
		return -1;
	}

	private int max(int a, int b, int c) {
		if (a > b) {
			return (a > c) ? a : c;
		} else
			return (b > c) ? b : c;
	}

}
