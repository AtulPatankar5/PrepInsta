package Day3;

import java.util.Scanner;

public class a_PerfectNumber {
//6=1+2+3

	public static int  isPerfect(int num) {

//		int sum = 0;
//		int temp = 0;
//		for (int i = 1; i < num; i++) {
//			if (num % i == 0) {
//				temp = i;
//				sum = sum + temp;
//			}
//		}
//		if (sum == num)
//			return true;
//		return false;
		int temp;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				temp = i;
			}
		if(temp==1) {
			return 1;
		}
		
		return temp + isPerfect(num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Numbers");
		int input = sc.nextInt();

		if (isPerfect(input)) {
			System.out.println("perfect Number");
		} else {
			System.out.println("not a perfect number ");
		}
	}

}
