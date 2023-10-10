package RevisionDay2;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {

	public static void main(String[] args) {
		int[] arr = { 4, 6, 4, 8, 6, 6, 6, 2, 0, 5, 2, 4 };
		Map<Integer, Integer> map = frequency(arr);
		System.out.println(map);

		frequencyAnotherWay(arr);
	}

	private static Map<Integer, Integer> frequency(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		return map;
	}

	private static void frequencyAnotherWay(int[] arr) {

		// Sort the elements
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > key) {
					arr[j + 1] = arr[j];
					arr[j] = key;
				}
			}
		}

		// 0,2,4,4,5,6,8
		for (int i = 0; i < arr.length; i++) {
			int start = arr[i];
			int count = 1;
			int j = 0;
			for (j = i + 1; j < arr.length; j++) {
				if (start == arr[j]) {
					count++;
					i = j;

				}

			}
			System.out.println(arr[i] + " " + count);
		}

	}
}
