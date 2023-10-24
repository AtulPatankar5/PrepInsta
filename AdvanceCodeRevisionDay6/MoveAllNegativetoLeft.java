package AdvanceCodeRevisionDay6;

import java.util.Arrays;

public class MoveAllNegativetoLeft {

	public static void main(String[] args) {

		int[] arr = { -1, 0, 3, 1, -4 };
		int[] result = leftshiftExtraArray(arr);
		System.out.println(Arrays.toString(result));

	}

	private static int[] leftshiftExtraArray(int[] arr) {
		int a = -1;
		int[] newArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				newArray[++a] = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				newArray[++a] = arr[i];
			}
		}

		return newArray;
	}

}
