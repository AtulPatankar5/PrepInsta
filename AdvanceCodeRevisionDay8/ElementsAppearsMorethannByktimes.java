package AdvanceCodeRevisionDay8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ElementsAppearsMorethannByktimes {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1 };
		int n = 12;
		int k = 4;

		Elements(arr, n, k);
	}

	private static void Elements(int[] arr, int n, int k) {

		int level = n / k; // 3

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (Entry<Integer, Integer> e : map.entrySet()) {
//			System.out.println(e);
			if (e.getValue() > level) {
				System.out.println(e.getKey());
			}
		}
	}

}
