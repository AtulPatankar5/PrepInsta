package RevisionDay4;

public class FibonaaciSeries {
// 0 1 1 2 3 5 8 13 21
// a b c
//   a b c
	public static void main(String[] args) {

		int n = 5;
		int result = fibonacci(n);
		System.out.println(result);

		int result2 = fibonacciRecursion(n);
		System.out.println(result2);
	}

	private static int fibonacciRecursion(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	private static int fibonacci(int n) {
		int a = 0;
		int b = 1;
		if (n == 1)
			return a;
		if (n == 2)
			return b;

		int c = 0;
		for (int i = 3; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}

		return c;
	}

}
