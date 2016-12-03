package arrays;

public class LeaderElement {
	/**
	 * Write a program to print all the LEADERS in the array. An element is
	 * leader if it is greater than all the elements to its right side. And the
	 * rightmost element is always a leader. For example int the array {16, 17,
	 * 4, 3, 5, 2}, leaders are 17, 5 and 2.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		int arraylength = 0;
		for (int element : arr) {
			arraylength++;
		}
		getLeader(arr, arraylength);
	}

	private static void getLeader(int[]arr,int arraylength){
		if(arraylength<=0){
			System.out.println("empty array");
			return;
		}
		int max=arr[arraylength-1];
		System.out.print("leader elements: "+max);
		if(arraylength==1)return;
		for(int i=arraylength-2;i>=0;i--){
			if(arr[i]>max){
				max=arr[i];
				System.out.print(","+max);
			}
		}
		return;
	}
}
