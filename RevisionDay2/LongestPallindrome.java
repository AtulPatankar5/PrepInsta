package RevisionDay2;

public class LongestPallindrome {

	public static void main(String[] args) {
		int[] arr = { 121, 2322, 54545, 999990 };

		System.out.println(longest(arr));

	}

	private static int longest(int[] arr) {
		int size = 0;
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if (pallindrome(arr[i])) {
				int length = sizeCalculate(arr[i]);
				if (length > size) {
					size = length;
					result = arr[i];
				}
			}
		}
		return result;
	}

	private static int sizeCalculate(int num) {
		int count = 0;
		while (num != 0) {
			num /= 10;
			count++;
		}
		return count;
	}

	private static boolean pallindrome(int num) {
		int sum = 0;
		int num2 = num;
		while (num != 0) {
			sum = sum * 10 + num % 10;
			num /= 10;
		}
		if (num2 == sum)
			return true;
		return false;
	}

}
