package PatternDay10;

public class BasicINcrementDiamondPatternInverted {

	public static void main(String[] args) {
		int n = 4;
		int start=2;
		for (int i = 1; i <= n; i++) {
			start++;
			for (int j = 1; j <= n; j++) {
				if(i>=j)
					System.out.print(start);
			}
			System.out.println();
		}
		
		for( int i=n-1;i>=1;i--) {
			start--;
			for (int j = 1; j <=n; j++) {
				if(i>=j)
					System.out.print(start);
			}
			System.out.println();
		}
		
	}
	
	
}
