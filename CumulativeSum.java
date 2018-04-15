
public class CumulativeSum {

	
	public static void main(String[] args) {
		
		System.out.println(cumulativeSum(3));
		System.out.println(cumulativeSum(4));
		
	}
	public static int cumulativeSum(int num) {
		
		if(num==1){
			return 1;
		}else
		{
			return cumulativeSum(num-1) + num;
		}		 
	}
}

