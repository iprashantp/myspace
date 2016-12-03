package arrays;

public class RotateArray {
	RotateArray() {
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Rotate(arr, arr[4]);
		PrintArr(arr);

	}

	private static void PrintArr(int[] arr) {
		for (int element : arr) {
			System.out.println(element);
		}
		return;
	}

	private static void Rotate(int[] arr, int rotationPoint) {
		int position = 0;
		int length = arr.length;
		while (arr[position] != rotationPoint && position < length) {
			position++;
		}
		if (position >= length) {
			System.out.println("rotation point not found");
			return;
		}
		int temp = 0;
		for (int i = 0; i < position; i++) {
			temp = arr[0];
			for (int j = 0; j < length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[length - 1] = temp;
		}
		return;
	}

}
