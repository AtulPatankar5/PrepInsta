package RevisionDay4;

import java.util.Arrays;

public class EquilibriumIndex {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 10, 5, 1, 3, 2, 4, 3, 2, 5 };
//						  15		  5	 	15	

		int[] arr2 = { 15, 1, 5, 2, 3, 3, 2 };
// 					   15  i        15

		int arr3[] = { 1, 2, 3, 4, 5, 1, 3, 2, 4 };
		int index = equilirium(arr3);
		System.out.println(index);
		System.out.println(Arrays.toString(arr));
	}

	private static int equilirium(int[] arr) {

		int leftsum = arr[0];
		int rightsum = arr[arr.length - 1];
		int index = -1;
		int r = arr.length - 1;
		int l = 0;
		for (int i = 0; i < arr.length; i++) {

			if (l > r)
				break;
			if (l + 2 == r && r - 2 == l && leftsum == rightsum) {
				index = l + 1;
				break;
			}
			if (leftsum <= rightsum) {
				leftsum = leftsum + arr[++l];
			}
			if (rightsum <= leftsum) {
				rightsum = rightsum + arr[--r];
			}

		}

		return index;
	}

}
