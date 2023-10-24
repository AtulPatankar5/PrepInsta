package AdvanceCodeRevisionDay7;

import java.util.Arrays;

public class MinimizeTheMaximumDiffernce {

	public static void main(String[] args) {

//		int[] arr = { 3, 9, 12, 16, 20 };
//		int k = 3;
		
		int[] arr = { 7, 4, 8, 8, 8, 9 };
		int k=6;
		int result = mindiff(arr, k);
		System.out.println(result);
	}

	private static int mindiff(int[] arr, int k) {
		Arrays.sort(arr);
		int largest = arr[arr.length - 1] - k;
		int smallest = arr[0] + k;
		int diff = largest - smallest;
		int mi, mx;
		for (int i = 1; i < arr.length-1; i++) {

			mx = Math.max(arr[i] + k, largest);
			mi = Math.min(smallest, arr[i + 1] - k);

			if (mx - mi < diff) {
				diff = mx - mi;
			}
		}

		return diff;
	}

}
