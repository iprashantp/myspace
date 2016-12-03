package MAQ;

public class AdditionHalfAdder {

	public static void main(String[] args) {
		int sum = Add(11, 15);
		System.out.println(sum);
	}

	private static int Add(int x, int y) {
		int carry;
		while (y != 0) {
			carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}
		return x;
	}

}
