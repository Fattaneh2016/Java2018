
import java.util.*;
public class Practise {

	public static void main(String[] arg) {

		int[] myArray= {2,4,5,67,8};
		System.out.println("e is " + Arrays.toString(myArray));

		double myAve=average(myArray);
		System.out.println("my average " + myAve);

		int x = 9;
		int y = 2;
		int z = 5;
		mystery(z, y, x);
		mystery(y, x, z);

		factor();
		digit();

		mystery2(5);
		System.out.println();		
		System.out.println(mystery(348));
	}
	
	public static int mystery(int n) {
		if (n < 10) {
		return (10 * n) + n;
		} else {
		int a = mystery(n / 10);
		int b = mystery(n % 10);
		return (100 * a) + b;
		}
		}
	
	public static void mystery2(int n)
	{
		if (n==1)
			System.out.print("*");
		else if (n==2)
			System.out.print("**");
		else{
			System.out.print("<");
			mystery2(n-2);
			System.out.print(">");
		}
	}
	public static void mystery(int x, int z, int y) {
		System.out.println(z+ " and " + (y-x));
	}

	public static void factor() {
		int n = 91;
		int factor = 2;
		while (n % factor != 0) {
			factor++;
		}
		System.out.println("First factor is " + factor);
	}
	public static void digit() {
		int digits = 0;
		int value = 99999;
		do {
			value /= 10;
			digits++;
		} while (value > 0);
		System.out.println(digits);
	}

	public static double average(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return (double) sum / numbers.length;
	}
}



