package AdvanceCodeRevisionDay9;

public class RainWaterTrap {

	public static void main(String[] args) {

//		int[] arr = { 3, 0, 2, 0, 4 };
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int result = rainwater(arr);
		System.out.println(result);
	}

	private static int rainwater(int[] arr) {
		int sum = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			int lmax = leftMax(i - 1, arr);
			int rmax = rightMax(i + 1, arr);
			int val = Math.min(lmax, rmax);
			 sum += Math.max(0, val - arr[i]);
		}

		return sum;
	}

	private static int rightMax(int i, int[] arr) {
		int max = 0;
		while (i < arr.length) {
			max = Math.max(arr[i], max);
			i++;
		}
		return max;
	}

	private static int leftMax(int i, int[] arr) {
		int max = 0;
		while (i >= 0 ) {
			max = Math.max(arr[i], max);
			i--;
		}
		return max;
	}

}
