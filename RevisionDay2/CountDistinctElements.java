package RevisionDay2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDistinctElements {

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 30, 40, 20, 10, 20, 50, 10 };
		int result = countDistinctMap(arr);
		System.out.println(result);

		int result2 = countDistinct(arr);
		System.out.println(result2);
	}

	private static int countDistinct(int[] arr) {
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
//		[10, 10, 10, 20, 20, 30, 40, 50]
		int start = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == start) {
				continue;
			} else {
				count++;
				start = arr[i];
			}
		}
		return count;
	}

	private static int countDistinctMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		return map.size();
	}

}
