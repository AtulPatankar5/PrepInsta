package AdvanceCodeRevisionDay7;

public class CountInversion {

	public static void main(String[] args) {
		int[] arr = { 20, 1, 6, 4, 5 };
		int result = inversionSelectionSort(arr);
		System.out.println(result);

		int[] arr1 = { 20, 1, 6, 4, 5 };
		int result1 = inversioninsertionSort(arr1);
		System.out.println(result1);

	}

	private static int inversioninsertionSort(int[] arr) {
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (key < arr[j]) {
					arr[j + 1] = arr[j];
					arr[j] = key;
					++count;
				}
			}
		}
		return count;
	}

	private static int inversionSelectionSort(int[] arr) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					count++;
				}
			}
		}

		return count;
	}

}
