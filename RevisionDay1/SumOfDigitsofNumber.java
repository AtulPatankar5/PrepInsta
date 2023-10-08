package RevisionDay1;

public class SumOfDigitsofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
//		int sum = 0;
//		while (num != 0) {
//			int val = num % 10;
//			sum += val;
//			num = num / 10;
//		}
//		System.out.println(sum);

		int result = summation(num);
		System.out.println(result);
	}

	// 1234
	public static int summation(int n) {
		if (n == 0)
			return 0;
		int val = n % 10;
		return val + summation(n / 10);
	}
}
