package Day1;	

public class l_ArmStringOFRange {

	/*
	 * Example Input : 1 1000 Output : 1 2 3 4 5 6 7 8 9 153 370 371 407
	 */

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 1000;

		for (int i = num1; i < num2; i++) {
			int count = 0;
			int temp1 = i;
			// count the numbers
			while (temp1 != 0) {
				temp1 = temp1 / 10;
				count++;
			}
//			System.out.println(count);

			// Run the loop based on number of digits
			int temp2 = i;
			int sum = 0;
			while (temp2 != 0) {
				int init = 1;
				int firstNum = temp2 % 10;
				for (int j = 0; j < count; j++) {
					init = init * firstNum;
				}
				temp2 = temp2 / 10;
				sum = sum + init;
			}

			// Print the pallidrome numbers
			if (sum == i)
				System.out.println(i);

		}
	}

}
