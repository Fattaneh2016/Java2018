import java.util.ArrayList;
import java.util.Collections;


public class ClientCircle {
 
	public static void main(String[] arg){
		
		ArrayList<Circle> list1=new ArrayList<Circle>();
		
		list1.add(new Circle(3,new Point(4,6)));
		list1.add(new Circle(5,new Point(4,6)));
		list1.add(new Circle(67,new Point(3,6)));
		list1.add(new Circle(2,new Point(77,6)));
		list1.add(new Circle(1,new Point(3,6)));
		list1.add(new Circle(7,new Point(9,6)));
		list1.add(new Circle(8,new Point(4,6)));
		list1.add(new Circle(3,new Point(2,6)));
		list1.add(new Circle(8,new Point(12,6)));
		list1.add(new Circle(9,new Point(6,6)));
		
		
		System.out.println(list1.toString());
		Collections.sort(list1);
		System.out.println(list1.toString());
	}
}
