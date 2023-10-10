package RevisionDay2;

import java.util.Arrays;

public class SortHalfIncreasingandOtherDecreasing {

	public static void main(String[] args) {
		int[] arr = { 1, 90, 34, 89, 7, 9, 10, 77 };
//						  j	 key
		// 1,7,9,90,89,34
		// Insertion Sort
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > key) {
					arr[j + 1] = arr[j];
					arr[j] = key;
				}
			}
		}
		// 1,7,9,10, 34, 77,89,90
//		   0 1 2  3  4  5 6 7
		// 1,7,9,90,89,34
		int val = (arr.length - arr.length / 2) / 2;// (6-3)/2=3/2=1
		int a = 0;
		for (int i = arr.length / 2; i < ((arr.length / 2) + val); i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - a];
			arr[arr.length - 1 - a] = temp;
			a++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
