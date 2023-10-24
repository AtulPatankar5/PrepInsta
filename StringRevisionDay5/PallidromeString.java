package StringRevisionDay5;

public class PallidromeString {

	public static void main(String[] args) {
		String str = "ARORA";

		String result = pallindrome(str);
		System.out.println(str.equals(result));
	}

	private static String pallindrome(String str) {
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		String Newstr = new String(arr);
		return Newstr;
	}

}
