package RevisionDay2;

public class SecongLargestELementInArray {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 6, 8, 2, 1,7, 9, 1 };
		int result = secondsamllest(arr);
		System.out.println(result);
	}

	private static int secondsamllest(int[] arr) {
		int min = arr[0];
		int secondSmallest = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				secondSmallest = min;
				min = arr[i];
			}
		}
		return secondSmallest;
	}

}
