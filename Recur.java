
public class Recur {

	public static void main ( String [] args){
		
		// print 5 series of numbers .Start from 1 and print the sum of the first number by itself for example 1+1=2
		
		// ,next add the second number which is 2 become  2+2.
		
		/*1+1=2
		
		1+1=2
		2+2=4
		
		1+1=2
		2+2=4
		3+3=6
		
		1+1=2
		2+2=4
		3+3=6
		4+4=8
		
		1+1=2
		2+2=4
		3+3=6
		4+4=8
		5+5=10
		*/				
				
		print(5);
		
	}
	
	
	
	public static void print(int n) {
		
		if(n!=0){
			
			//recursive method print, call itself 
			print(n-1);
			
			//call printNum which is also recursive 
			printNum(n);
			System.out.println();
		}
		
	}

	public  static void printNum(int n) {
		if(n!=0){
			//recursive printNum call itself
			printNum(n-1);
			
			//print numbers 
			System.out.println(n+n+ " ");
		}
		
	}
}
