package RevisionDay1;

public class StrongNumberDyamicProgramming {
	static int[] fact = new int[10];

	public static void preComputed() {
		fact[0] = fact[1] = 1;
		for (int i = 2; i < 10; i++) {
			fact[i] = fact[i - 1] * i;
		}
	}

	public static void main(String[] args) {
		int num = 145;
		preComputed();
		int result = StrongNumber(num);
		System.out.println(num == result);

	}

	private static int StrongNumber(int num) {
		int sum = 0;
		while (num != 0) {
			int val = num % 10;
			int result = fact[val];
			sum += result;
			num /= 10;
		}
		return sum;
	}

}
