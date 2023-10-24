package AdvanceCodeRevisionDay7;

public class BestTimeToBUyAndSellStock {

	public static void main(String[] args) {

		int[] arr = { 7, 1, 5, 3, 6, 4 };
		int result = bestime(arr);
		System.out.println(result);

		int result2 = bestTimeOPtimal(arr);
		System.out.println(result2);
	}

	private static int bestTimeOPtimal(int[] arr) {

		int min = arr[0];
		int maxProfit = 0;
		for (int i = 0; i < arr.length; i++) {
			int cost = arr[i] - min;
			maxProfit = Math.max(maxProfit, cost);
			min = Math.min(min, arr[i]);
		}
		return maxProfit;
	}

	private static int bestime(int[] arr) {
		int val = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] > arr[i]) {
					val = arr[j] - arr[i];
				}
				if (val > max) {
					max = val;
				}

			}
		}

		return max;
	}

}
