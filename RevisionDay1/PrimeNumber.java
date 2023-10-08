package RevisionDay1;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static boolean isPrime(int num) {
		if (num == 1)
			return false;
		if (num == 2 || num == 3)
			return true;
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		for (int i = 5; i * i <= num; i = i + 6) {
			if (num % i == 0 || num % (i + 2) == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 151;
		boolean result = isPrime(num);
		System.out.println("Prime NUmber = " + result);

		int num1 = 2;
		int num2 = 30;
		List<Integer> result1 = RangePrimeNumber(num1, num2);
		System.out.println(result1);

//		boolean flag=false;
//		for (int i = 2; i < num; i++) {
//			if (num % i == 0) {
//				flag = false;
//				break;
//			} else
//				flag = true;
//		}
//		System.out.println("prime Number "+flag);
	}

	private static List<Integer> RangePrimeNumber(int num1, int num2) {

		List<Integer> list = new ArrayList<>();
		for (int i = num1; i <= num2; i++) {
			if (isPrime(i)) {
				list.add(i);
			}
		}
		return list;
	}

}
