
public class RectangleClient {

	
	public static void main(String[] args) {
		
		
		Rectangle rec1=new Rectangle();
		Rectangle rec2=new Rectangle();		
		
		rec1.setfields(12, 2, 3, 4);		
		rec2.setfields(10, 4, 60, 8);
				
		
		System.out.println("The area of rectangle is " + rec1.getArea() + 
				" and the x-coordinate is " + rec1.getX() +" and the y-coordinate is " + rec1.getY() );
		
		System.out.println("The area of rectangle is " + rec2.getArea() + 
				" and the x-coordinate is " + rec2.getX() +" and the y-coordinate is " + rec2.getY() );
		
		
	}

}
