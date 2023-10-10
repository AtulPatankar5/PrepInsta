package RevisionDay3;

public class MaximumSubarrayProduct {

	public static void main(String[] args) {
		int arr[] = { 10, -20, -30, 0, 70, -80, -20 };
//		int arr[] = { 2, 3, -2, -5, -1, 6, 10, 30 };
		int result = maxProductNaiveSolution(arr);

		System.out.println(result);

		int result2 = maxProductOptimal(arr);
		System.out.println(result2);
	}

	private static int maxProductOptimal(int[] arr) {
		int prefix = 1;
		int suffix = 1;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			// Prefix
			int val = arr[i] * prefix;
			if (val > max) {
				max = val;
			}
			prefix = val;
			if (arr[i] == 0) {
				prefix = 1;
			}

			// Suffix
			int val2 = arr[arr.length - 1 - i] * suffix;
			if (val2 > max) {
				max = val2;
			}
			suffix = val2;
			if (arr[arr.length - 1 - i] == 0) {
				suffix = 1;
			}
		}
		return max;
	}

	private static int maxProductNaiveSolution(int[] arr) {

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				sum = sum * arr[j];
				if (sum > max)
					max = sum;
			}
		}
		return max;
	}

}
