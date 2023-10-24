package PatternDay10;

public class parallelogram2 {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			int space = n - i;
			for (int k = 1; k <= space; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
