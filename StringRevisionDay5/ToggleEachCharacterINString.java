package StringRevisionDay5;

public class ToggleEachCharacterINString {

	public static void main(String[] args) {
		String s = "PrePInsTa";
		String result = toggleTraditinal(s);
		System.out.println(result);

		String result2 = toggleFunction(s);
		System.out.println(result2);
	}

	private static String toggleFunction(String s) {

		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (Character.isUpperCase(arr[i])) {
				arr[i] = Character.toLowerCase(arr[i]);
			} else {
				arr[i] = Character.toUpperCase(arr[i]);
			}
		}
		String newString = new String(arr);
		return newString;

	}

	private static String toggleTraditinal(String s) {

		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 65 && arr[i] <= 90) {
				int val = arr[i];
				arr[i] = (char) (val + 32);
			} else {
				int val = arr[i];
				arr[i] = (char) (val - 32);

			}
		}
		String newString = new String(arr);
		return newString;
	}

}
