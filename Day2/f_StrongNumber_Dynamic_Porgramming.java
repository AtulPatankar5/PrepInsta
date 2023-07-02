package Day2;

public class f_StrongNumber_Dynamic_Porgramming {

// Dynamic Programming Approach

	static int[] arr = new int[11];

	static void preComputedFactorial() {
		arr[0] = arr[1] = 1;
		for (int i = 2; i <= 10; i++) {
			arr[i] = arr[i - 1] * i;
		}

	}

	static void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]=> "+i +"! ="+arr[i]);
		}
	}

	public static void main(String[] args) {
		int num = 145;
		preComputedFactorial();// to get data in the main class
		int tempNum = num;
		int sum = 0;
		while (num != 0) {
			int temp = num % 10;// get individual digit for getting factorial of number
			sum = sum + arr[temp];
			num = num / 10;
		}

		System.out.println(sum);
		if (tempNum == sum)
			System.out.println("It is Strong Number");
		else
			System.out.println("Not a Strong Number ");
		System.out.println();
		display();
	}
}
