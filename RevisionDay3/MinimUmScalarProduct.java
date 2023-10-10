package RevisionDay3;

import java.util.Arrays;

public class MinimUmScalarProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 6, 3, 7 };
		int arr2[] = { 10, 7, 45, 3, 7 };
		int result = product(arr1, arr2);
		System.out.println(result);
	}

	private static int product(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

//		[1, 2, 3, 6, 7]
//		[3, 7, 7, 10, 45]
		int start = 0;
		int sum = 0;
		for (int i = arr2.length - 1; i >= 0; i--) {
			int result = arr1[start++] * arr2[i];
			sum += result;
		}

		return sum;
	}

}
