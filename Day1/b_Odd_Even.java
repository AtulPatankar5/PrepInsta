package Day1;

public class b_Odd_Even {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int num=54;
//		if(num%2==0)
//			System.out.println("Even ");
//		else
//			System.out.println("Odd");
//	}

	public static void main(String[] args) {

		int num = 57;
		if (isEven(num))
			System.out.println("Even");
		System.out.println("Odd");

	}

	public static boolean isEven(int num) {

		if (num % 2 == 0)
			return true;
		else
			return false;
	}

}
