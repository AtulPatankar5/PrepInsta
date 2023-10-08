package RevisionDay1;

public class FriendLyPair {

	public static void main(String[] args) {
		int num1 = 6;// 1 2 3
		int num2 = 28;// 1 2 4 7 14
		boolean result = friendlyPair(num1, num2);
		System.out.println(result);
	}

	private static boolean friendlyPair(int num1, int num2) {
		int sum1 = factSum(num1);
		int sum2 = factSum(num2);
		System.out.println(sum1);
		System.out.println(sum2);
		if (num1 / sum1 == num2 / sum2) {
			return true;
		}

		return false;
	}

	private static int factSum(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				sum += i;
		}

		return sum;
	}

}
