package RevisionDay1;

public class HarshadNumber {

	public static void main(String[] args) {
		int num = 21;
		boolean result = harshad(num);
		System.out.println(result);
	}

	private static boolean harshad(int num) {
		int sum = 0;
		while (num != 0) {
			int val = num % 10;
			sum += val;
			num /= 10;
		}

		if (num % sum == 0)
			return true;
		return false;
	}

}
