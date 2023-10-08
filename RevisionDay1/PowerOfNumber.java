package RevisionDay1;

public class PowerOfNumber {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int result = power(a, b);
		System.out.println(result);
	}

	private static int power(int a, int b) {
		int sum = 1;
		for (int i = 0; i < b; i++) {
			sum = sum * a;
		}
		return sum;
	}

}
