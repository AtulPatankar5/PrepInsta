package AdvanceCodeRevisionDay9;

import java.util.Arrays;

public class ThreeWayPartition {

	public static void main(String[] args) {
		int[] arr = { 1, 17, 22, 16, 13, 5, 43, 18, 3, 10 };
		int min = 14;
		int max = 20;
		partion(arr, min, max);
		System.out.println(Arrays.toString(arr));
	}

	private static void partion(int[] arr, int min, int max) {

		int a = 0;
		int b = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				swap(a, i, arr);
				a++;
				continue;

			}
			if (arr[i] > min && arr[i] < max) {
				continue;
			}
			if (arr[i] > max && b >= i) {
				swap(b, i, arr);
				b--;
				i--;
			}
		}

	}

	private static void swap(int b, int i, int[] arr) {
		int temp = arr[b];
		arr[b] = arr[i];
		arr[i] = temp;
	}

}
