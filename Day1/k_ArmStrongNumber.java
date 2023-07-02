package Day1;

public class k_ArmStrongNumber {

	// 371= 3^3 + 7^3 + 1^3= 27 + 343+1
	// 153= 1+ 125+ 27=153
	public static void main(String[] args) {

		int num = 370;
		int num2 = num;
		int count = 0;
		int temp = num;
		while (temp != 0) {
			temp = temp / 10;
			++count;
		}
		System.out.println("------------------" + count);
		int sum = 0;
		while (num2 != 0) {
			int firstNum = (num2 % 10);
			int prod = 1;
			for (int i = 0; i < count; i++) {
				prod = prod * firstNum;
//				System.out.println(prod);
			}
			num2 = num2 / 10;
			sum = sum + prod;
//			System.out.println("sum" + sum);
		}

	//	System.out.println(sum);

		if (sum == num)
			System.out.println("Pallindrome number");
		else
			System.out.println("Not a Pallindrome Number ");
	}

}
