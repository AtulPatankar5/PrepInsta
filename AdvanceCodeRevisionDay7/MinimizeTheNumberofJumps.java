package AdvanceCodeRevisionDay7;

public class MinimizeTheNumberofJumps {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 3, 2, 3, 4, 5, 1, 2, 8 };
//					  0	    0        0  	     0  => 3
//					  0  1  2  3  4  5  6  7  8  9

//		int arr[] = { 2, 3, 1, 1, 4 };
		int result = jumps(arr);
		System.out.println(result);

	}

	private static int jumps(int[] arr) {
		int pos = 0;
		int jumps = 0;
		int des = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			des = Math.max(des, arr[i] + i);
			if (pos == i) {
				pos = des;
				jumps++;
			}
		}

		return jumps;
	}
}
