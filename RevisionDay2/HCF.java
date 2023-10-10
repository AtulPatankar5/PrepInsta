package RevisionDay2;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 36;
		int b =60;
		int c = Math.min(a, b);
		while (c > 0) {
			if (b % c == 0 && a % c == 0) {
				System.out.println("HCF=" + c);
				break;
			}
			c--;
		}
	}

}
