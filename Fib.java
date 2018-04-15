
public class Fib {

	
	public static void main(String[] args) {
		//1,1,2,3,5,8,13,21,..
		System.out.println(fib(4));
		System.out.println(fib(5));
		System.out.println(fib(6));
		System.out.println(fib(7));
	}
	
	public static int fib(int num){
		
		if(num==0){
			return 0;
		}else if(num==1)
		{
			return 1;
		}			
		return fib(num-1)+ fib(num-2) ;
	}		

}
