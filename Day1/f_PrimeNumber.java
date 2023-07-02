package Day1;

import java.util.Scanner;

public class f_PrimeNumber {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		boolean flag=false;
		while(!flag) {
			System.out.println("Enter number ");
			int num = sc.nextInt();
//			int count = 0;
//			for (int i = 2; i < num; i++) {
//				if (num % i == 0)
//					count++;
//			}
//			if (count >= 1)
//				System.out.println("not prime ");
//			else
//				System.out.println("prime ");
			if (isPrime(num))
				System.out.println("Prime Number");
			else
				System.out.println("not a Prime Number");
		
		}
		
	}

	public static boolean isPrime(int num) {

		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				count++;
		}
		if (count >= 1)
			return false;
		else
			return true;
	}

}
