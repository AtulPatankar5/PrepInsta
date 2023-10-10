package RevisionDay3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		int[] arr = { 10, 30, 20, 10, 40, 20 };
		int size = duplicate(arr);
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		int[] arr2 = { 10, 30, 20, 10, 40, 20 };
		removeDuplicateHashMap(arr2);

	}

	private static void removeDuplicateHashMap(int[] arr2) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				Integer value = map.get(arr2[i]);
				map.put(arr2[i], value + 1);
			} else {
				map.put(arr2[i], 1);
			}
		}
		
		for (Entry<Integer, Integer> i : map.entrySet()) {
			System.out.println("Map="+i.getKey());
		} 
			
		

	}

	private static int duplicate(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		// [10, 10, 20, 20, 30, 40]
		int start = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[start] != arr[i + 1]) {
				arr[++start] = arr[i + 1];
			}
		}
		return (start + 1);
	}

}
