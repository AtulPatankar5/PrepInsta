package RevisionDay2;

public class LargestElementInArray {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 6, 8, 2, 7, 9, 1 };
		int result = largest(arr);
		System.out.println(result);
	}

	private static int largest(int[] arr) {
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		return largest;
	}

}
