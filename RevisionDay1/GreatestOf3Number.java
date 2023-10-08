package RevisionDay1;

public class GreatestOf3Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int b = 8;
		int c = 6;
		if (a >= b && a >= c) {
			System.out.println("a is greater than b and c");
		} else if ( b >= c) {
			System.out.println("b is greater than a and c");
		} else {
			System.out.println("c is greater than a and b");
		}
	}

}
