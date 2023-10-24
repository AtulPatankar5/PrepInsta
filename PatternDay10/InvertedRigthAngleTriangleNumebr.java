package PatternDay10;

import java.util.Scanner;

public class InvertedRigthAngleTriangleNumebr {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int count = ((n + 1) * n) / 2;
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count);
				count--;
			}
			System.out.println();
		}
	}

}
