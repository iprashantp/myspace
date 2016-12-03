package arrays;

/**
 * 
 * @author prashant
 *
 */
/*
 * This algo is to find the max contiguous sum in 1D array
 */
public class KadanesAlgo {

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		//int maxContSum = FindMaxContSum(arr);
		int maxContSum = FindMaxContSum2(arr);
		System.out.println(maxContSum);
	}

	public static int FindMaxContSum(int[] arr) {
		int maxSum = 0;
		int sumTillCurrent = 0;
		int arrLength = arr.length;

		for (int i = 0; i < arrLength; i++) {
			sumTillCurrent += arr[i];

			if (sumTillCurrent > maxSum) {
				maxSum = sumTillCurrent;
			} else if (sumTillCurrent < 0) {
				sumTillCurrent = 0;
			}
		}
		return maxSum;
	}

	/**
	 * using DP
	 */
	public static int FindMaxContSum2(int[]arr) {
		int length = arr.length;
		int currentSum = arr[0];
		int maxSum = arr[0];
		
		for(int i=1;i<length;i++){
			currentSum = max(arr[i],currentSum+arr[i]);
			if(maxSum<currentSum){
				maxSum = currentSum;
			}
		}

		return maxSum;
	}

	public static int max(int x, int y) {
		return ((x > y) ? x : y);
	}

}
