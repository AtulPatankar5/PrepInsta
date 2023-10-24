package AdvanceCodeRevisionDay6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UnionAndIntersectionOfArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5, 4 };
		int[] arr2 = { 3, 4, 5, 6, 7, 8 };
		// 1 2 3 4 5 6 7 8

		Object[] result = unionIntersect(arr1, arr2);
		System.out.println(Arrays.toString(result));
	}

	private static Object[] unionIntersect(int[] arr1, int[] arr2) {

		Map<Integer, Integer> map = new HashMap<>();

		// arr1
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				map.put(arr1[i], 1);
			} else {
				map.put(arr1[i], 1);
			}
		}

		// arr2
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				map.put(arr2[i], 1);
			} else {
				map.put(arr2[i], 1);
			}
		}

		List<Integer> list = new ArrayList<>();
		for (Entry<Integer, Integer> c : map.entrySet()) {
			list.add(c.getKey());
		}
		Object [] newArray =  list.toArray();
		return newArray;
	}

}
