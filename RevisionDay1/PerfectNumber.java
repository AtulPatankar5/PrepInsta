package RevisionDay1;

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 4;
		int result = perfect(num);
		System.out.println(result == num);

		int num2 = 6;
		int sum = 0;
		int i = 1;
		int result2 = perfectRecursion(num2, sum, i);
		System.out.println(result2 == num2);

	}

	private static int perfectRecursion(int num2, int sum, int i) {
		if (i == num2)
			return sum;
		if (num2 % i == 0)
			sum += i;
		return perfectRecursion(num2, sum, ++i);
	}

	private static int perfect(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		return sum;
	}
}
