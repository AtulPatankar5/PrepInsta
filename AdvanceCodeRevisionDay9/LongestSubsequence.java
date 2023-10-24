package AdvanceCodeRevisionDay9;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LongestSubsequence {

	public static void main(String[] args) {

//		int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
//		int arr[] = { 100, 102, 100, 101, 101, 4, 3, 2, 3, 2, 1, 1, 1, 2 };
//		int result = subsequenceBrute(arr);
//		System.out.println(result);


//		int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
		int arr[] = { 100, 102, 100, 101, 101, 4, 3,103,104,105, 2, 3, 2, 1, 1, 1, 2 };
		int result = subsequenceOptimal(arr);
		System.out.println(result);

	}

	private static int subsequenceOptimal(int[] arr) {
		Set<Integer> set = new TreeSet<>();
		for (Integer integer : arr) {
			set.add(integer);
		}

		System.out.println(set);

		Integer smallest = Integer.MAX_VALUE;
		Iterator<Integer> iterator = set.iterator();
		if (iterator.hasNext()) {
			smallest = iterator.next();
		}

//		[1, 2, 3, 4, 9, 10, 20]
		int count = 1;
		int val = 1;
		for (Integer i : set) {
			if (iterator.hasNext()) {
				Integer number=iterator.next();
				if(number==smallest+1) {
					smallest=number;
					val++;
				}
				else {
					smallest=number;
					val=1;
				}
			}
			if(val>count)
				count=val;
		}

		return count;
	}

	private static int subsequenceBrute(int[] arr) {

		Arrays.sort(arr);
//		[1, 2, 3, 4, 9, 10, 20]
//		[1, 1, 1, 2, 2, 2, 3, 3, 4, 100, 100, 101, 101, 102]		

		int count = 1;
		int val = 1;
		int smallest = arr[0];
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != smallest && smallest + 1 == arr[j]) {
				val++;
				smallest = arr[j];
			} else if (arr[j] == smallest) {
				continue;
			} else {
				val = 1;
				smallest = arr[j];
			}

			if (val > count) {
				count = val;
			}
		}

		return count;
	}

}
