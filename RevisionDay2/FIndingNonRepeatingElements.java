package RevisionDay2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FIndingNonRepeatingElements {

	public static void main(String[] args) {
		int arr[] = { 10, 30, 30, 20, 10, 60, 50, 10 };
		Nonrepeating(arr);
		NonrepeatingMap(arr);
	}

	private static void NonrepeatingMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (Entry<Integer, Integer> i : map.entrySet()) {
			if (i.getValue() == 1) {
				System.out.println("Non Repeating map=" + i);

			}
		}

	}

	private static void Nonrepeating(int[] arr) {

		// Sort the array
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
//		[10, 10, 10, 20, 30, 30, 50, 60, 60]
		if (arr.length == 0) {
			return; // Handle empty array
		}

//	    // Print the first element if it's different from the second element
		if (arr[0] != arr[1]) {
			System.out.println(arr[0]);
		}

		// Iterate through the array, skipping duplicates
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
				System.out.println(arr[i]);
			}
		}

		// Print the last element if it's different from the second-to-last element
		if (arr[arr.length - 1] != arr[arr.length - 2]) {
			System.out.println(arr[arr.length - 1]);
		}
	}

}
