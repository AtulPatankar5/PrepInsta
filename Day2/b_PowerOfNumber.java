package Day2;

public class b_PowerOfNumber {

	//2^3=8
	public static void main(String[] args) {

		int base=2;
		int power = 3;
		int init=1;
		while(power!=0)
		{
			init=init*base;
			power--;
		}
		System.out.println(init);

	}

}
