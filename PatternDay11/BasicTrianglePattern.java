package PatternDay11;

public class BasicTrianglePattern {

//    7*8*9*10
//    4*5*6
//    2*3
//    1
	public static void main(String[] args) {

		int n = 4;
		int start = 11;
		int addon = 4;
		for (int i = 1; i <= n; i++) {
			start -= addon--;
			int val = start;
			for (int j = 1; j <= n; j++) {
				if (i + j <= n) {
					System.out.print(val++ + "*");
				}
				if (i + j == n + 1)
					System.out.print(val);
			}
			System.out.println();
		}

	}

}
