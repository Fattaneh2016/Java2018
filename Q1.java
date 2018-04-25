
public class Q1 {

	public static void main(String[] arg){		
		numbers();
	}

	private static void numbers() {
		
		for ( int i=5;i>=1;i--){
			
			for(int j=5;j>=i;j--){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();  
	}
}
