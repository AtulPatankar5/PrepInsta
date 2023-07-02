package Day2;

public class d_PrimeFactors {

	// 12=2 2 3

	public static boolean isPrime(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				count++;
		}
		if (count == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {

		int temp = 12;
		int num = temp;
		for (int i = 2; i < temp; i++) {
			if (isPrime(i)) {
				while (num != 0) {
					if (num % i == 0) {
						System.out.println(i);
						num = num / i;
						System.out.println("num=" + num);
					} else
						break;

				}
			}
		}
	}
}
