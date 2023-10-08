package RevisionDay1;

public class ArmStringNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 371;
		int result = armstrong(num);
//		System.out.println(result);
		System.out.println(num == result);

		int num2 = 371;
		int def = 0;
		int result2 = armStrongRecursion(num2, sizeCalculate(num2), def);
//		System.out.println(result2);
		System.out.println(num2 == result2);
	}

	private static int armStrongRecursion(int num2, int size, int def) {

		if (num2 == 0)
			return def;
		int val = num2 % 10;
		int sum = 1;
		for (int j = 0; j < size; j++) {
			sum = sum * val;
		}
//		System.out.println(sum);
		def = def + sum;
		return armStrongRecursion(num2 / 10, size, def);
	}

	private static int armstrong(int num) {
		int size = sizeCalculate(num);
		int result = 0;
		for (int i = 0; i < size; i++) {
			int sum = 1;
			int val = num % 10;
			for (int j = 0; j < size; j++) {
				sum = sum * val;
			}
			result = result + sum;
			num = num / 10;
		}
		return result;
	}

	private static int sizeCalculate(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

}
