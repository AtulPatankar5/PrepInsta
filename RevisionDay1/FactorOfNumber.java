package RevisionDay1;

public class FactorOfNumber {
	public static void main(String[] args) {
		int num = 10;
		factor(num);
	}

	private static void factor(int num) {

		for (int i = 1; i <= num/2; i++) {
			if (num % i == 0)
				System.out.println(i);
		}

	}
}
