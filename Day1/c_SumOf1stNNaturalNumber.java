package Day1;

public class c_SumOf1stNNaturalNumber {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num = 50;
//
//		int sum = 0;
//		for (int i = 1; i <= num; i++) {
//			sum = sum + i;
//		}
//		System.out.println("Sum of N natura numbers is " + sum);
//	}

	// Recursion

	public static void main(String[] args) {

		int num = 50;
		int sum = sumNatural(num);

		System.out.println("Sum of "+ num + " is "+ sum);
	}

	public static int sumNatural(int num) {

		if (num == 1)
			return 1;
		return num + sumNatural(num - 1);

	}
}
