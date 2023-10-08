package RevisionDay1;

public class AbundantNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 18;
		boolean result = abundant(num);
		System.out.println(result);
	}

	private static boolean abundant(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				sum += i;
		}
		System.out.println(sum);
		if (sum > num)
			return true;
		return false;

	}

}
