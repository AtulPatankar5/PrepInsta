package PatternDay11;

public class doubleincrementingTrianglePatternInverted {

//    3
//    54
//    876
//    1211109
//    876
//    54
//    3
	public static void main(String[] args) {

		int n = 4;
		int start = 2;
		int jumps = 1;
		for (int i = 1; i <= n; i++) {
			start = start + jumps++;
			int val = start;
			for (int j = 1; j <= n; j++) {
				if (i >= j) {
					System.out.print(val-- + " ");
				}
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			start = start - --jumps;
			int val = start;
			for (int j = 1; j <= n; j++) {
				if (i >= j)
					System.out.print(val-- + " ");
			}
			System.out.println();
		}
	}

}
