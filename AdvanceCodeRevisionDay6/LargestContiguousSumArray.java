package AdvanceCodeRevisionDay6;

public class LargestContiguousSumArray {

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		// 4, -1, -2, 1, 5, ==> 7
		int result = largestSumNaieve(arr);
		System.out.println(result);

		int result2 = largestKadaneAlgorithm(arr);
		System.out.println(result2);
	}

	private static int largestKadaneAlgorithm(int[] arr) {

		int MAX = Integer.MIN_VALUE;
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if ((arr[i] + max) > arr[i]) {
				max = (arr[i] + max);
			} else
				max = arr[i];

			if (max > MAX) {
				MAX = max;
			}
		}


		return MAX;
	}

	private static int largestSumNaieve(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int start = 0;
			for (int j = i; j < arr.length; j++) {
				start = start + arr[j];
				if (start > max) {
					max = start;
				}
			}
		}

		return max;
	}

}
