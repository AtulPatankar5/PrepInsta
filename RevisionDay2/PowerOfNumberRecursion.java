package RevisionDay2;

public class PowerOfNumberRecursion {

	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int result = power(a, b);
		System.out.println(result);
	}

	private static int power(int a, int b) {
		if (b == 0)
			return 1;
		return a * power(a, b - 1);
	}

}
