
public class PrintNumber {

	public static void main(String[] args) {
		print(5);
	}

	private static void print(int n) {
		
		if(n!=0) {
			print(n-1);
			printNum(n);
			System.out.println();
		}
		
	}

	private static void printNum(int n) {
		
		if(n!=0) {
			printNum(n-1);
			System.out.print(n+n);
		}
		
	}

}
