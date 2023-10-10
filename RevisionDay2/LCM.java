package RevisionDay2;

public class LCM {

	public static void main(String[] args) {
		int a = 5;
		int b = 25;
		int c = Math.max(a, b);
		while (true) {
			if (c % a == 0 && c % b == 0) {
				System.out.println(c);
				break;
			}
			c++;
		}
	}

}
