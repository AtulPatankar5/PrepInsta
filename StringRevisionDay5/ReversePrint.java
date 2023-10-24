package StringRevisionDay5;

public class ReversePrint {

	public static void main(String[] args) {
		String str = "Prepinsta";
		String result = reverse(str);
		System.out.println(result);
	}

	private static String reverse(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length/2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		return new String(arr);
	}

}
