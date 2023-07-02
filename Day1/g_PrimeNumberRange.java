package Day1;

public class g_PrimeNumberRange {

	public static void main(String[] args) {

		int num1 = 2;
		int num2 = 20;
		for (int i = num1; i <= num2; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0)
				System.out.println(i);
		}
	}
}
