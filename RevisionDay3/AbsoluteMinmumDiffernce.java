package RevisionDay3;

import java.util.Arrays;

class AbsoluteMinmumDiffernce {
	public static void main(String[] args) {
//		int[] arr = { 2, -2, 4 };
		int[] arr = { 1, -3, 71, 68, 17 };

		int result = minNaieve(arr);
		System.out.println(result);

		int result2 = minOptimal(arr);
		System.out.println(result2);

	}

	private static int minOptimal(int[] arr) {
		Arrays.sort(arr);
//		[-3, 1, 17, 68, 71]
		int min = Integer.MAX_VALUE;
		int start = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int val = arr[i] - start;
			if (val < 0)
				val = -1 * val;
			if (val < min)
				min = val;
			start = arr[i];
		}

		return min;
	}

	private static int minNaieve(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int val = arr[i] - arr[j];
				if (val < 0)
					val = -1 * val;
				if (val < min)
					min = val;
			}
		}

		return min;
	}

}
