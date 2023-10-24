package RevisionDay4;

import java.util.Arrays;

public class RoatationOfArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		// 40, 50, 60, 70, 10, 20, 30
		int result[] = rotate(arr, 3);
		System.out.println(Arrays.toString(result));
	}

	private static int[] rotate(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}

		return arr;
	}

}
