
public class Recursive {

	
	public static void main(String[] args) {
		
		String s1="Hi";
		System.out.println(repeat(s1 ,1));
		
		String s2="Bye";
		System.out.println(repeat(s2 ,0));
		
		String s3="Hello";
		System.out.println(repeat(s3 ,4));
		
	}

	private static String repeat(String s ,int n) {
		
		if(n==0){
			return "";
		}else{			
			return  s + repeat(s,n-1);		
		}		
	}
}
