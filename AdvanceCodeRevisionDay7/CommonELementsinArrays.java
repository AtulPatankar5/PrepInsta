package AdvanceCodeRevisionDay7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonELementsinArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 5, 10, 20, 40, 80 };
		int arr2[] = { 6, 7, 20, 80, 100 };
		int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

//		int arrr3[] = { 5, 5, 10, 20 };

//		List<Integer> result = common(arr1, arr2, arr3);
//		System.out.println(result);

		List<Integer> list = commonOptimal(arr1, arr2, arr3);
		System.out.println(list);
	}

	private static List<Integer> commonOptimal(int[] arr1, int[] arr2, int[] arr3) {
		List<Integer> list = new ArrayList<>();
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] < arr2[j] || arr1[i] < arr3[k]) {
				i++;
			}
			if (arr2[j] < arr1[i] || arr2[j] < arr3[k]) {
				j++;
			}
			if (arr3[k] < arr1[i] || arr3[k] < arr2[j]) {
				k++;
			}
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				list.add(arr1[i]);

				i++;
				j++;
				k++;

			}
		}
		return list;
	}

	private static List<Integer> common(int[] arr1, int[] arr2, int[] arr3) {

		List<Integer> list = new ArrayList<>();

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				int count = map.get(arr1[i]);
				map.put(arr1[i], count + 1);
			} else {
				map.put(arr1[i], 1);
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				int count = map.get(arr2[i]);
				map.put(arr2[i], count + 1);
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			if (map.containsKey(arr3[i])) {
				int count = map.get(arr3[i]);
				map.put(arr3[i], count - 2);
				int newcount = map.get(arr3[i]);
				if (newcount % 2 == 0)
					list.add(arr3[i]);

			}

		}
		return list;

	}

}
