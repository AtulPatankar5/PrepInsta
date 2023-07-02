package Day2;

public class e_StrongNumber {

	public static int factorial(int num) {
		if (num == 0)
			return 1;
		return num * factorial(num - 1);
	}

	public static void main(String[] args) {
		int num = 145;
		int tempNum = num;
		int sum = 0;
		while (num != 0) {
			int temp = num % 10;
			int result = factorial(temp);
			sum = sum + result;
			num = num / 10;
		}

		System.out.println(sum);
		if (tempNum == sum)
			System.out.println("It is Strong Number");

		else
			System.out.println("Not a Strong Number ");

	}
}

// Dynamic Programming Approach

class Main {
	static int f[] = new int[10];

	// Finding factorial for number 0 to 9
	// to precompute factorials without needing them to be calculated again and
	// again
	// you can change this 0 to 15 or 0 to 20 for larger values
	// in this case change to long
	static void preComputer() {
		f[0] = f[1] = 1;
		for (int i = 2; i < 10; ++i)
			f[i] = f[i - 1] * i;
	}

	static boolean checkStrong(int num) {
		int sum = 0;

		// traverse individual digits of num
		int temp = num;

		while (temp > 0) {
			sum += f[temp % 10];
			temp = temp / 10;
		}
		return (sum == num);
	}

	public static void main(String[] args) {
		// calling preCompute
		// this way we do not need to calculate factorial again and again
		// we can directly use saved up values like dynamic programming
		preComputer();
		int val = 145;

		if (checkStrong(val))
			System.out.println("Its a strong number");
		else
			System.out.println("Its not a strong number");
	}
}
