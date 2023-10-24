package StringRevisionDay5;

public class RemoveWordFromString {

	public static void main(String[] args) {

		String str = "This is the prepinsta";
		// Word to be removed from above string
		String word = "the ";

		String result = replaceString(str, word);
		System.out.println(result);

		String result2 = str.replace(word, "");
		System.out.println(result2);
	}

	private static String replaceString(String originalString, String substringToReplace) {

		int count = 0;
		String newString = "";
		int a = 0;
		int startindex = -1;
		for (int i = 0; i < originalString.length(); i++) {
			if (substringToReplace.charAt(a) == originalString.charAt(i)) {
				startindex = i;
				for (int j = 0; j < substringToReplace.length(); j++) {
					if (substringToReplace.charAt(j) == originalString.charAt(i)) {
						i++;
						count++;
					}
					if (count == substringToReplace.length()) {
						break;
					}
				}
				i--;
			} else {
				newString += originalString.charAt(i);
			}
			if (count > 0 && count != substringToReplace.length()) {
				i = startindex;
				newString += originalString.charAt(i);
			}
			count = 0;
		}
		return newString;
	}

}
