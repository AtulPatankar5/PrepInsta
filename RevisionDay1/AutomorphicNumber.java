package RevisionDay1;

public class AutomorphicNumber {

	public static void main(String[] args) {
// 5^2=25
//6^2=36
//	76^2=5776
//376^2=141376

		int num = 376;
		int result = automorphic(num);
		System.out.println(num == result);
	}

	private static int automorphic(int num) {

		int result = num * num;
		int size = countDigits(num);
		int val = 0;
		for (int i = 0; i < size; i++) {
			val = result % size;
		}
		return val;
	}

	private static int countDigits(int num) {
		int size = 1;
		while (num != 0) {
			num /= 10;
			size *= 10;
		}
		return size;
	}

}
