package AdvanceCodeRevisionDay9;

public class SmallestSubarraywithSumGreaterThanGivenValue {

	public static void main(String[] args) {

//		int arr[] = { 1, 2, 4, 3 };
//		int sum = 6;

		int[] arr = { 1, 4, 45, 6, 10, 19 };
		int sum = 51;
		int result = subarray(arr, sum);
		System.out.println(result);
	}

	private static int subarray(int[] arr, int sum) {
		int subarraylength = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			int newSum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (newSum > sum)
					break;
				if (newSum <= sum) {
					newSum += arr[j];
					count++;
				}

			}
			if (count < subarraylength && newSum > sum) {
				subarraylength = count;
			}
		}

		return subarraylength;
	}

}
