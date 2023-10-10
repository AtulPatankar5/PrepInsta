package RevisionDay2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FIndingRepeatingElements {

	public static void main(String[] args) {
		int arr[] = { 10, 30, 30, 20, 60, 60, 10, 60, 50, 10 };
		repeating(arr);
		repeatingMap(arr);
	}

	private static void repeatingMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
//		System.out.println(map);
//		Set<Integer> keySet = map.keySet();
//		for (Integer i : keySet) {
//			if (map.get(i) > 1) {
//				System.out.println("Repeating map=" + i);
//			}
//		}

		for (Entry<Integer, Integer> i : map.entrySet()) {
			if (i.getValue() > 1) {
				System.out.println("Repeating map="+i.getKey());

			}
		}

	}

	private static void repeating(int[] arr) {

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
		int start = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == start && i == arr.length - 1) {
				System.out.println("Repeating normal="+start);
			}

			if (arr[i] == start) {
				count++;
				continue;
			} else {
				start = arr[i];
			}
			if (count > 1)
				System.out.println("Repeating normal="+arr[i - 1]);
			count = 1;
		}
	}

}
