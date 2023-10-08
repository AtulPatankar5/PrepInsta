package RevisionDay1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 5;
		int result = fibonacciSeries(n);
		System.out.println(result);

		int num = 5;
		int result2 = fibonacciSeriesRecursive(num);
		System.out.println(result2);
	}

	private static int fibonacciSeriesRecursive(int n) {
		if (n == 0)
			return 1;
		return n * fibonacciSeriesRecursive(n - 1);
	}

	private static int fibonacciSeries(int n) {
		int sum = 1;
		while (n != 0) {
			sum = sum * n;
			n--;
		}

		return sum;
	}
}
