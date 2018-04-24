
public class RectangleClient {
	public static void main(String[] args) {		
		Rectangle myRec=new Rectangle(2, 5, 8, 10);
		System.out.println(myRec.contains(2, 5));
		System.out.println(myRec.contains(10, 15));
		
		System.out.println("this rectangle contains point (5, 6) " + myRec.contains(5, 6));
		System.out.println(myRec.toString());
	}

}
