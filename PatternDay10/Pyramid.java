package PatternDay10;

public class Pyramid {

	public static void main(String[] args) {
		int n = 4;
		int addon = 0;
		for (int i = 1; i <= n; i++) {
			int space = n - i;
			int star = i + addon++;
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
