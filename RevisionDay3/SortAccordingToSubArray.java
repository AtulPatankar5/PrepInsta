package RevisionDay3;

import java.util.Arrays;

public class SortAccordingToSubArray {

	public static void main(String[] args) {
//		int arr1[] = { 1, 2, 3, 4, 3, 2, 4, 2, 5 };
//		int arr2[] = { 4, 2, 1, 3 };
		// 4, 4, 2, 2, 2, 1, 3, 3, 5

		int arr1[] = { 20, 1, 20, 5, 7, 1, 9, 39, 6, 18, 18 };
		int arr2[] = { 20, 1, 18, 39 };
//[20, 20, 1, 1, 18, 18, 39, 5, 6, 7, 9]
//[20, 20, 1, 1, 18, 18, 39, 9, 6, 7, 5]
		int a = 0;
		for (int i = 0; i < arr2.length; i++) {
			int start = arr2[i];
			for (int j = 0; j < arr1.length; j++) {
				// Swapping the numbers
				if (start == arr1[j]) {
					int temp = arr1[a];
					arr1[a] = arr1[j];
					arr1[j] = temp;
					a++;
				}
			}

		}
		System.out.println(Arrays.toString(arr1));

	}

}
