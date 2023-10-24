package StringRevisionDay5;

public class RemoveSpecialCharacter {

	static int length = -1;

	public static void main(String[] args) {

		String s = "$P*r;e..pi, ns'ta^?";// Prepinsta
		String result = removeSpecial(s);
		System.out.println(result);

		String result2 = removeSpecialOptimal(s);
		for( int i=0;i<=length;i++) {
			System.out.print(result2.charAt(i));
		}
	}

	private static String removeSpecialOptimal(String s) {
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char c = Character.toLowerCase(arr[i]);
			if (c >= 97 && c <= 122) {
				arr[++length] = arr[i];
			}
		}

		return new String(arr);
	}

	private static String removeSpecial(String s) {
		String str = "";
		char[] arr = s.toCharArray();
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			char c = Character.toLowerCase(arr[i]);
			if (c >= 97 && c <= 122) {
				str += arr[i];

			}
		}

		return str;
	}
}
