package Day1;

public class h_SumOfDigits {

	// 1234= 1+2+3+4=10
	public static void main(String[] args) {

		int num = 1254;
//		int sum = 0;
//		while (num != 0) {
//			sum = sum + (num % 10);
//			num=num/10;
//		}
//		System.out.println("Sum is "+sum);
		int sum = sumOfDigits(num);
		System.out.println("result is " + sum);
	}

	public static int sumOfDigits(int num) {
		if (num == 0)
			return 0;
		return (num % 10) + sumOfDigits(num / 10);
	}

}
