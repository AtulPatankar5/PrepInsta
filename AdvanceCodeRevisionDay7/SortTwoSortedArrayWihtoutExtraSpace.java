package AdvanceCodeRevisionDay7;

import java.util.Arrays;

public class SortTwoSortedArrayWihtoutExtraSpace {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 0, 2, 6, 8, 9 };
		sort(arr1, arr2);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

	private static void sort(int[] arr1, int[] arr2) {

		int L = arr1.length - 1;
		int R = 0;
		while (arr2[R] < arr1[L] && L >= 0 && R <= arr2.length - 1) {
			int temp = arr1[L];
			arr1[L] = arr2[R];
			arr2[R] = temp;
			R++;
			L--;
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}

}
