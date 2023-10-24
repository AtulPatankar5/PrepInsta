package StringRevisionDay5;

public class RemoveSpace {

	static int length = -1;

	public static void main(String[] args) {
		String s = "Java Code is helpful";
		String newString = remove(s);
		System.out.println(newString);

		String newString2 = removeOptimal(s);
		for (int i = 0; i <= length; i++) {
			System.out.print(newString2.charAt(i));
		}

	}

	private static String removeOptimal(String s) {
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				continue;
			}
			arr[++length] = arr[i];
		}

		return new String(arr);
	}

	private static String remove(String s) {

		String str = "";
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				continue;
			}
			str += arr[i];
		}

		return str;
	}

}
