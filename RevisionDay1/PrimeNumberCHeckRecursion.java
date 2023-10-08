package RevisionDay1;

public class PrimeNumberCHeckRecursion {

	static int i = 2;

	public static boolean primeNumber(int n) {
		if (n < 2)
			return false;
		if (i == n)
			return true;
		if (n % i == 0)
			return false;
		i++;
		return primeNumber(n);

	}

	public static void main(String[] args) {
		int n = 23;
		boolean result = primeNumber(n);
		System.out.println(result);
	}

}
