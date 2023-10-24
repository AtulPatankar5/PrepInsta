package StringRevisionDay5;

public class ReplaceAllVowels {
	public static void main(String[] args) {
		String s = "prepInsta";
		String result = removeVowels(s);
		System.out.println(result);
	}

	private static String removeVowels(String s) {
		String result = "";
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char lowerCase = lowerCase(arr[i]);
			if (isVowel(lowerCase)) {
				continue;
			}
			result = result + arr[i];
		}
		return result;
	}

	private static boolean isVowel(char lowerCase) {

		if (lowerCase == 'a' || lowerCase == 'e' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'u')
			return true;
		return false;
	}

	private static char lowerCase(char c) {
		int value = c;
		char result = c;
		if (c >= 65 && c <= 90) {
			result = (char) (value + 32);
		}
		return result;

	}
}
