package RevisionDay3;

import java.util.HashMap;
import java.util.Map;

public class ArraySubsetofAnotherArray {

	public static void main(String[] args) {
		int arr1[] = { 11, 10, 13, 21, 30, 70 };
		int arr2[] = { 11, 30, 70, 10 };
		boolean result = subsetNaieve(arr1, arr2);
		System.out.println(result);

		boolean result2 = subsethashmap(arr1, arr2);
		System.out.println(result2);

	}

	private static boolean subsethashmap(int[] arr1, int[] arr2) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if (!map.containsKey(arr1[i])) {
				map.put(arr1[i], 1);
			}
		}
		
		for( int i=0;i<arr2.length;i++) {
			if(!map.containsKey(arr2[i])) {
				return false;
			}
		}
		return true;
	}

	private static int[] sorting(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > key) {
					arr[j + 1] = arr[j];
					arr[j] = key;
				}
			}
		}
		return arr;
	}

	private static boolean subsetNaieve(int[] arr1, int[] arr2) {

//		[10, 11, 13, 21, 30, 70]
//		[10, 11, 30, 70]
		int[] array1 = sorting(arr1);
		int[] array2 = sorting(arr2);
		int count = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array2[i] == array1[j]) {
					count++;
					break;
				}
			}
			if (count == array2.length) {
				return true;
			}
		}
		return false;
	}

}
