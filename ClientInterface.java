
public class ClientInterface {

	
	public static void main(String[] args) {
		

		SequentialIncrementer se=new SequentialIncrementer();
		
		System.out.println(se.getValue());
		se.increment(6);
		System.out.println(se.getValue());
		
		
		RandomIncrementer ra=new RandomIncrementer();
		
		System.out.println(ra.getValue());
		ra.increment(44);
		System.out.println(ra.getValue());
		
	}
	
	

}
