package PatternDay10;

public class InversePyramid {

	public static void main(String[] args) {
		int n = 4;
		int addon = n - 1;
		for (int i = n; i >= 1; i--) {
			int space = n - i;
			int star = i + addon--;
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = star; j >= 1; j--) {
				if(i==n) {
					System.out.print("* ");
					continue;
				
				}
				
				if (i != n && (j == star || j == 1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
