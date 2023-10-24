package StringRevisionDay5;

import java.util.HashMap;
import java.util.Map;

public class AnagramString {

	public static void main(String[] args) {

		String s1 = "IpapaI";
		String s2 = "apIIpa";

		boolean result = anagramCheckHashMap(s1, s2);
		System.out.println(result);

		boolean result2 = anagramMethod(s1, s2);
		System.out.println(result2);

	}

	private static boolean anagramMethod(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;
		int count = 0;
		int[] arr = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			arr[s1.charAt(i)]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			if (arr[s2.charAt(i)] > 0) {
				count++;
				arr[s2.charAt(i)]--;
			}
		}

		return count == s1.length();
	}

	private static boolean anagramCheckHashMap(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i))) {
				int count = map.get(s1.charAt(i));
				map.put(s1.charAt(i), count + 1);
			} else {
				map.put(s1.charAt(i), 1);
			}
		}
		int value = 0;
		for (int i = 0; i < s2.length(); i++) {
			if (map.containsKey(s2.charAt(i))) {
				int count = map.get(s2.charAt(i));
				if (count > 0) {
					map.put(s2.charAt(i), count - 1);
					++value;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}

		return value == s2.length();
	}

}
