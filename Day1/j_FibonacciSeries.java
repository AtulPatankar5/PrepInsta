package Day1;

public class j_FibonacciSeries {

	// 0 1 1 2 3 5 8 13
	// a b c
	// a b c

	public static void main(String[] args) {

		int num = 10;
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i < num; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
