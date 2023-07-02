package Day1;

public class d_SumOfNumbersBetnweenRange {

//	public static void main(String[] args) {
//		int num1 = 12;
//		int num2 = 15;
//		int sum=0;
//		for(int i=num1;i<=15;i++) {
//			sum=sum+i;	
//		}
//		System.out.println(sum);
//	}

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 15;

		int sum = sumNumber(num1, num2);
		System.out.println("Sum is " + sum);
	}

	public static int sumNumber(int num1, int num2) {

		if (num1 == num2)
			return num2;

		return num1 + sumNumber(++num1, num2);

	}
}
