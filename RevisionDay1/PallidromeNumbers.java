package RevisionDay1;

public class PallidromeNumbers {

	public static void main(String[] args) {
		int num = 121;
		int result = pallidrome(num);
		System.out.println(result == num);

		int num2 = 121;
		int sum = 0;
		int result2 = recursionPallidrome(num2, sum);
		System.out.println(result2 == num2);
	}

	private static int recursionPallidrome(int num2, int sum) {
		if (num2 == 0)
			return sum;

		sum = sum * 10 + num2 % 10;
		return recursionPallidrome(num2 / 10, sum);
	}

	private static int pallidrome(int num) {
		int sum = 0;
		while (num != 0) {
			int val = num % 10;
			sum = sum * 10 + val;
			num /= 10;
		}

		return sum;
	}

}
