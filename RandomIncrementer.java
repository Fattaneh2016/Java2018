import java.util.*;
import java.lang.*;
public class RandomIncrementer implements Incrementable  {

	private int val;

Random rand=new Random();
	
	public   void  increment(int value){
		val=rand.nextInt(1000);
	}

	public int getValue(){

		return val;
	}
}
