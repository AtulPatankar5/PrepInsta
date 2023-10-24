package AdvanceCodeRevisionDay7;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithSumEqualtoZero {

	public static void main(String[] args) {

		int arr[] = { -3, 3, 1, 6 };
		boolean result = sumzero(arr);
		System.out.println(result);

		int [] arr2= {-3,4,-3,-1,1};
		boolean result2 = sumZeroHashSet(arr2);
		System.out.println(result2);
	}

	private static boolean sumZeroHashSet(int[] arr) {

		Set<Integer> set = new HashSet<>();
		int pref_Sum = 0;
		for (int i = 0; i < arr.length; i++) {
			pref_Sum += arr[i];
			if (set.contains(pref_Sum) || pref_Sum==0) {
				return true;
			} else {
				set.add(pref_Sum);
			}
		}
		return false;
	}

	private static boolean sumzero(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] + arr[j] == 0) {
					return true;
				}
				if (arr[i] == 0 || arr[j] == 0)
					return true;
			}
		}

		return false;
	}

}
