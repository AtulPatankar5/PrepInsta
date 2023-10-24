package AdvanceCodeRevisionDay9;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 4, 3, 0, 0 };
//		int[] arr = { 5, 4, 3, 2, 1, 0, 0 };
		int[] result = nextPermut(arr);
		System.out.println(Arrays.toString(result));
	}

	private static int[] nextPermut(int[] arr) {
		if (arr == null || arr.length == 0) {
			return null;
		}

		// 1. to find the index with value greater than previous value
		int i = arr.length - 2;
		while (i > -1 && arr[i] >= arr[i + 1]) {
			i--;
		}
		if (i > -1) {

			int index = arr[i];// index value

			// 2. find the value which is greater than index (only smallest)
			int last = arr.length - 1;// last index
			while (arr[last] < index) {
				last--;
			}

			// . Swap the found index
			swap(i, last, arr);
		}
		// 3. Reverse the string from i+1 to last index
		int start = i + 1;
		int k = 0;
		for (int j = start; j <= (arr.length - 1 + start) / 2; j++) {
			int temp = arr[j];
			arr[j] = arr[arr.length - 1 - k];
			arr[arr.length - 1 - k] = temp;
			k++;
		}
		return arr;
	}

	private static void swap(int i, int last, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[last];
		arr[last] = temp;

	}

}
