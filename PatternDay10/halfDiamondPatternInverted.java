package PatternDay10;

public class halfDiamondPatternInverted {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j > n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				if (j + i > n ) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
