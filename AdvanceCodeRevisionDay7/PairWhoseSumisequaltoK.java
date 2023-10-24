package AdvanceCodeRevisionDay7;

import java.util.HashMap;
import java.util.Map;

public class PairWhoseSumisequaltoK {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, -1 };
		int sum = 6;

		int result = sumEqual(arr, sum);
		System.out.println(result);

		int result2 = sumEqualHashMap(arr, sum);
		System.out.println(result2);
	}

	private static int sumEqualHashMap(int[] arr, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				int count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			}
		}
		int pair = 0;
		for (int i = 0; i < arr.length; i++) {
			int value = sum - map.get(arr[i]);// 6-1=5
			if (map.containsKey(value)) {
				pair++;
			}
		}

		return pair/2;
	}

	private static int sumEqual(int[] arr, int sum) {
		int pair = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					pair++;
				}
			}

		}
		return pair;
	}

}
