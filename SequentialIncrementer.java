


public class SequentialIncrementer implements Incrementable {
	private int mvalue;
		
	public   void  increment(int value){
		mvalue=value+1;
	}
	public int getValue(){
		
		return mvalue;
	}
}
