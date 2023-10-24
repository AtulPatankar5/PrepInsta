package AdvanceCodeRevisionDay9;

public class LeastOperationtoMakeArrayPallindrome {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 9, 1 };
		int result = operations(arr);
		System.out.println(result);
	}

	private static int operations(int[] arr) {
		int count = 0;
		int a = 0;
		int b = arr.length - 1;
		while (a <= b) {
			if (arr[a] == arr[b]) {
				a++;
				b--;
				continue;
			} else {
				count++;
				a++;
				b--;
			}
		}
		return count;
	}

}
