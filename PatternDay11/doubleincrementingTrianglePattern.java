package PatternDay11;

public class doubleincrementingTrianglePattern {

//	     3
//       45
//       678
//       9101112
//       678
//       45
//       3
	public static void main(String[] args) {

		int n = 4;
		int start = 2;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i >= j) {
					System.out.print(++start + " ");
				}
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			start = start - i * 2;
			for (int j = 1; j <= n; j++) {
				if (i >= j)
					System.out.print(start++ + " ");
			}
			start--;
			System.out.println();
		}
	}

}
