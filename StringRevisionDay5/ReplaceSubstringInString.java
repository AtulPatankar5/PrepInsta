package StringRevisionDay5;

public class ReplaceSubstringInString {

	public static void main(String[] args) {
		String originalString = "Hello, World India World!";
		String substringToReplace = "World";
		String replacement = "Java";

		String result = replaceString(originalString, substringToReplace, replacement);
		System.out.println(result);
		
		String result2 = originalString.replace(substringToReplace, replacement);
        System.out.println(result2);
	}

	private static String replaceString(String originalString, String substringToReplace, String replacement) {

		int count = 0;
		String newString = "";
		int a = 0;
		for (int i = 0; i < originalString.length(); i++) {
			if (substringToReplace.charAt(a) == originalString.charAt(i)) {
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
				if (count == substringToReplace.length()) {
					for (int k = 0; k < replacement.length(); k++) {
						newString += replacement.charAt(k);
					}
				}
				count = 0;
			} else {
				newString += originalString.charAt(i);
			}
		}

		return newString;
	}

}
