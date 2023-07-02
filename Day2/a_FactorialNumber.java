package Day2;

public class a_FactorialNumber {

//	public static void main(String[] args) {
//
//		int num = 5;
//		int prod=1;
//		while (num != 1) {
//			prod=prod*num;
//			num--;
//		}
//		System.out.println(prod);
//	}

	public static void main(String[] args) {
		int num = 5;
		int result = factorial(num);
		System.out.println(result);
	}

	public static int factorial(int num) {

		if (num == 0)
			return 1;
		return num * factorial(num - 1);
	}

}
