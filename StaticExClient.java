
public class StaticExClient {
 public static void main(String[] args) {
	 
	 StaticEx s1=new StaticEx();
	 //point 1
	 System.out.println( StaticEx.getCount()); 
	 
	 StaticEx s2=new StaticEx();
	 //point 2
	 System.out.println( StaticEx.getCount()); 
	 
	 System.out.println( s1.getCount());
 }
}
