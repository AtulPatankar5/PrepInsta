package RevisionDay3;

import java.util.HashMap;
import java.util.Map;

public class DisjointArray {

	public static void main(String[] args) {
		int arr1[] = { 10, 51, 3, 43, 6 };
		int arr2[] = { 80, 71, 29, 3 };
		boolean result = disjointNaive(arr1, arr2);
		System.out.println("Disjoint=" + result);

		boolean result2 = disjointHashing(arr1, arr2);
		System.out.println("Disjoint map="+result2);
	}

	private static boolean disjointHashing(int[] arr1, int[] arr2) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if (!map.containsKey(arr1[i])) {
				map.put(arr1[i], 1);
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i]))
				return false;
		}
		return true;
	}

	private static boolean disjointNaive(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			int index = arr1[i];
			for (int j = 0; j < arr2.length; j++) {
				if (index == arr2[j]) {
					return false;
				}
			}
		}

		return true;
	}

}
