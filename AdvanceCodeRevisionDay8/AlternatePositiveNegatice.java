package AdvanceCodeRevisionDay8;

import java.util.Arrays;

public class AlternatePositiveNegatice {

	public static void main(String[] args) {

		int[] arr = { 2, 3, -4, -1, 6, -9 };
//					  s  s	       	e	e   
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			if (arr[start] > 0) {
				start++;
			} else {
				if (arr[end] > 0) {
					int temp = arr[start];
					arr[start] = arr[end];
					arr[end] = temp;
				}
			}

			if (arr[end] < 0) {
				end--;
			} else {
				if (arr[start] < 0) {
					int temp = arr[start];
					arr[start] = arr[end];
					arr[end] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(arr));

		// [2, 3, 6, -1, -4, -9]
//		   k        s   
//		  [-1, 3, 6, 2, -4, -9]
//				  k	     s
//		  [-1, 3,-4, 2, 6, -9]
//		  		  k	    s
//		  [-1, 3,-4, 2, 6, -9]
//					    k	s

		int k = 0;

		while (start != arr.length && k != arr.length) {
			int temp = arr[k];
			arr[k] = arr[start];
			arr[start] = temp;
			k += 2;
			start++;
		}
		System.out.println(Arrays.toString(arr));

	}

}
