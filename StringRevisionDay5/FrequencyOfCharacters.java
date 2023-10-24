package StringRevisionDay5;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

	public static void main(String[] args) {

		String str = "ALLAHABADalllahabad";
		frequency(str);

		Map<Character, Integer> map = frequencyHashMap(str);
		System.out.println(map);

	}

	private static void frequency(String str) {
		int[] c = new int[256];

		// Count the frequency of both uppercase and lowercase letters
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (Character.isLetter(currentChar)) {
				c[currentChar]++;
			}

		}

		// Print the frequencies
		for (int i = 0; i < 256; i++) {
			if (c[i] > 0) {
				System.out.println((char) i + " = " + c[i]);
			}
		}
	}

	private static Map<Character, Integer> frequencyHashMap(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), count + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		return map;
	}

}
