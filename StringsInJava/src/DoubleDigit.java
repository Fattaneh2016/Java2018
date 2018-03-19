
public class DoubleDigit {
	public static void main(String[] args) {
				
			System.out.println(doubleDigit(348));									
	}	
	public static int doubleDigit(int n) {
				
		if (n < 10) {
			return (10 * n) + n;
		} else {
			int a = doubleDigit(n / 10);
			int b = doubleDigit(n % 10);
			return (100 * a) + b;
		}		
		
	}
}
