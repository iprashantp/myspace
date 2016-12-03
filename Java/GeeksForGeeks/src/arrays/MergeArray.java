package arrays;

/**
 * 
 * @author prashant
 *
 */
public class MergeArray {
	private static final int NA = -1;

	public static void main(String[] args) {
		int mPlusN[] = { -1, 5, 7, -1, -1, 6, -1, 8, -1, 9 };
		int arrN[] = { 2, 4, 10, 11, 20 };
		int n = arrN.length;
		int m = mPlusN.length - n;

		ShiftElements(mPlusN, m + n);
		MergeElements(mPlusN, arrN, m, n);

		for (int i = 0; i < m + n; i++) {
			System.out.print(mPlusN[i] + " ");
		}

	}

	public static void ShiftElements(int[] mPlusN, int size) {
		int i = size - 1;
		int j = size - 1;
		while (i > 0) {
			if (mPlusN[i] != NA) {
				mPlusN[j--] = mPlusN[i];
			}
			i--;
		}
	}

	public static void MergeElements(int[] mPlusN, int[] arrN, int m, int n) {
		int i = 0;
		int j = n;
		int k = 0;
		try{
		while (k < m + n) {
			if ((j < m + n && (mPlusN[j] < arrN[i])) || j == n) {
				mPlusN[k] = mPlusN[j];
				j++;
			} else {
				mPlusN[k] = arrN[i];
				i++;
			}
			k++;
		}
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}

}
