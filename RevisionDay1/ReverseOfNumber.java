package RevisionDay1;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int num = 1234;
		int result = reverese(num);
		System.out.println(result);

		int num2 = 1234;
		int sum = 0;
		int result2 = reverseRecursion(num2, sum);
		System.out.println(result2);
	}

	private static int reverseRecursion(int num2, int sum) {

		if(num2==0) {
			return sum ;
		}
		int val = num2 % 10;
		sum = sum * 10 + val;

		return  reverseRecursion(num2 / 10, sum);
	}

	private static int reverese(int num) {

		int sum = 0;
		while (num != 0) {
			int val = num % 10;
			sum = sum * 10 + val;
			num /= 10;
		}
		return sum;
	}

}
