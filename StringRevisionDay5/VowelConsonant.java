package StringRevisionDay5;

public class VowelConsonant {

	public static void main(String[] args) {
		char a1 = 'z';
		int a=(int)a1;
		if (a >= 97 && a <= 122) {
			a = a - 32;
		}
		System.out.println((char) a);
		
		
		char b = 'b';
		char upperCase = Character.toUpperCase(b);
		System.out.println(upperCase);
	}

}
