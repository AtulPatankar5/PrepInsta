package PatternDay11;

public class BsicSquarePattern {
//    4*3*2*1
//    12*11*10*9
//    8*7*6*5
//    16*15*14*13

	public static void main(String[] args) {
		int n = 4;
		int odd = 4;
		int even = 8;
		int start = 8;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				start = start - odd;
			} else {
				start = start + even;
			}
			int val = start;
			for (int j = 1; j <= n; j++) {
				System.out.print(val-- + "* ");
			}
			System.out.println();
		}

	}

}
