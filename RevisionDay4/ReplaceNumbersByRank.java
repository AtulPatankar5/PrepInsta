package RevisionDay4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReplaceNumbersByRank {

	public static void main(String[] args) {

		int[] arr = { 100, 2, 70, 12, 90 };
		int[] result = rank(arr);
		System.out.println(Arrays.toString(result));

		System.out.println("---------------------Map-------------");
		int[] arr2 = { 100, 2, 70, 12, 90 };
		int[] result2 = rankHashMap(arr2);
		System.out.println(Arrays.toString(result2));
	}

	private static int[] rankHashMap(int[] arr) {
		int[] arr2 = new int[arr.length];// 100, 2, 70, 12, 90 };
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
		}
		Arrays.sort(arr);// [2, 12, 70, 90, 100]

		Map<Integer, Integer> map = new HashMap<>();

		int rank = 1;
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], rank++);
			}
		}

		for (int i = 0; i < arr.length; i++) {

			int value = map.get(arr2[i]);
			arr2[i] = value;
		}

		return arr2;
	}

	private static int[] rank(int[] arr) {
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
		}
		Arrays.sort(arr);

//		System.out.println(Arrays.toString(arr2));// [100, 2, 70, 12, 90]
//		System.out.println(Arrays.toString(arr));// [2, 12, 70, 90, 100]
		int a = 1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr[i] == arr2[j]) {
					arr2[j] = a++;
				}
			}
		}

		return arr2;
	}

}
