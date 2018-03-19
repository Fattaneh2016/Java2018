
public class Pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(3,4));
	}
	public static int pow(int n,int p) {
		
		if ( p==0) {
			return 1;
		}
		else {			
			return n * pow(n,p-1);
		}
	}

}
