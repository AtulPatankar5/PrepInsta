package AdvanceCodeRevisionDay8;

import java.util.Arrays;

public class MaxProfitBySellingSharetwice {

	public static void main(String[] args) {
		int price[] = { 2, 30, 15, 10, 8, 25, 80 };
//		int price[] = { 3, 3, 5, 0, 0, 3, 1, 4 };
//		int[] price = { 3, 0, 5, 6,0, 0, 3, 1, 4 };
		int result = maxProfit(price);
		System.out.println(result);
	}

	private static int maxProfit(int[] arr) {
	
		int[] copyArray = Arrays.copyOf(arr, arr.length);
		int sum = 0;
		int min = Integer.MAX_VALUE;
		Arrays.sort(copyArray);
		int highest = copyArray[copyArray.length - 1];
		int secondhighest = copyArray[copyArray.length - 2];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == highest || arr[i] == secondhighest) {
				sum += arr[i] - min;
				min = arr[i];
				continue;
			}
			min = Math.min(min, arr[i]);
		}
		return sum;
	}
}
