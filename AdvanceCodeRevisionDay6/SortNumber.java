package AdvanceCodeRevisionDay6;

import java.util.Arrays;

public class SortNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 1 };
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > key) {
					arr[j + 1] = arr[j];
					arr[j] = key;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
