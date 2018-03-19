
public class DoubleDigit {
	public static void main(String[] args) {
		
		int num=-348;
		
		if(num<0)
			System.out.println( "-" + doubleDigit(num));
		
		else {
			System.out.println(doubleDigit(num));						
		}
			
	}
	
	public static String doubleDigit(int n) {
				
		if( n==0){
			return "0";
		}
			
		else {
			return doubleDigit(n/10 ) + ( n % 10 + (n % 10 ) * 10 );
		}
		
	}
}
