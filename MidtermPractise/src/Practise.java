
public class Practise {

	public static void main(String[] arg) {

		int x = 9;
		int y = 2;
		int z = 5;
		mystery(z, y, x);
		mystery(y, x, z);
		
		factor();
		digit();
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
	
	
}
