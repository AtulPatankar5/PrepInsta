package StringRevisionDay5;

import java.util.HashMap;
import java.util.Map;

public class FirstNonrepeatingCharacter {

	public static void main(String[] args) {
		String str = "prepinsta";
		char result = nonRepeatingHashmap(str);
		System.out.println(result);

	}

	private static char nonRepeatingHashmap(String str) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), count + 1);

			} else {
				map.put(str.charAt(i), 1);
			}

		}
		for (int i = 0; i < str.length(); i++) {
			int value = map.get(str.charAt(i));
			if (value == 1) {
				return str.charAt(i);
			}
		}
		return ' ';
	}

}
