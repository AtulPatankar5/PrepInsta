package Day2;

public class c_FactorOfNumber {
//10=> 1,2 ,5
	public static void main(String[] args) {

		int num = 10;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				System.out.println(i);
		}
	}

}
