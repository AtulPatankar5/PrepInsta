package PatternDay11;

public class BasicIncrementSquareNumber {

//    1*2*3*4
//    9*10*11*12
//    5*6*7*8
//    13*14*15*16

	public static void main(String[] args) {
		int n = 4;
		int start = 8;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				start = start - 7;
			} else {
				start = start + 5;
			}

			for (int j = 1; j <= n; j++) {

				System.out.print(start++ + "* ");
			}
			start--;
			System.out.println();
		}

	}

}
