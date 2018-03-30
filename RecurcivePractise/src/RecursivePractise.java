
public class RecursivePractise {

	public static void main(String[] args) {
		
		System.out.println(fun(99));
		
		int[] a= {12,10,30,50,100};
	System.out.println(fun1(a,5));
	}

	private static int fun1(int[] a  ,int n) {		
		int x;
		if(n==1) {
			System.out.println(n);
			return a[0];
		}else {
			x=fun1(a,n-1);
			if(x>a[n-1]) {
				System.out.println(n);
				return x;
			}else {
				System.out.println(n);
				return a[n-1];
			}
		}		
	}
	private static int fun(int n) {
		
		if(n>100) {
			System.out.println(n);
			return n-10;			
		}else {
			System.out.println(n);
			return fun(fun(n+11));
		}	
	}

}
