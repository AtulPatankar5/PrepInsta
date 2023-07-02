package Day1;

public class j_PallindromeNumber {
//121==> Pallindrome
//123==> Not a Pallindrome

	public static void main(String[] args) {

		int num = 1231;
		int sum = 0;
		int temp = num;
		while (num != 0) {
			sum = sum * 10 + num % 10;
			num = num / 10;
		}
		if (sum == temp)
			System.out.println("it is pallindrome");
		else
			System.out.println("Not a Pallindrome");
	}
}
