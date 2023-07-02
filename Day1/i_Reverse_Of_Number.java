package Day1;

public class i_Reverse_Of_Number {

	// 1234==> 4321
	public static void main(String[] args) {

		/*
		 * num=1234 1> sum=0+4=4 num=123
		 * 
		 * 2> sum=40+3=43 num=12
		 * 
		 * 3> sum=430+2=432 num=1;
		 * 
		 * 4> sum=4320+1=4321 num=0
		 */

		int num = 1234;
		int sum = 0;
		int temp = 0;
		while (num != 0) {
			sum = sum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(sum);

		// Recursion
//		int result = reverseNumber(num);
//		System.out.println(result);
//
//	}
//
//	public static int sum = 0;
//
//	public static int reverseNumber(int num) {
//
//		if(num==0)
//			return 0;
//		sum=sum * 10 + num % 10;
//		System.out.println(sum);
//		sum=sum + reverseNumber(num / 10);
//		int result=sum;
//		return result;
//	}
	}
}
