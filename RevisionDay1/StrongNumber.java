package RevisionDay1;

public class StrongNumber {

	public static void main(String[] args) {
		int num = 145;
		int result = strongNumber(num);
		System.out.println(result == num);

		int num2 = 145;
		int sum = 0;
		int result2 = strongNumberRecursive(num2, sum);
		System.out.println(result2 == num2);
	}

	private static int strongNumberRecursive(int num2, int sum) {
		if (num2 == 0)
			return sum;

		int val = num2 % 10;
		int fact = factorial(val);
		sum = sum + fact;

		return strongNumberRecursive(num2 / 10, sum);
	}

	private static int strongNumber(int num) {
		int sum = 0;
		while (num != 0) {
			int val = num % 10;
			int fact = factorial(val);
			sum = sum + fact;
			num /= 10;
		}

		return sum;
	}

	private static int factorial(int val) {
		int sum = 1;
		while (val != 0) {
			sum = sum * val;
			val--;
		}
		return sum;
	}

}
