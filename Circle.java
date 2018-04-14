
public class Circle implements Comparable<Circle>{

	private int radius;
	private Point center ;

	public Circle(int radius,Point center){
		this.radius=radius;
		this.center=center;
	}

	public String toString(){
		 return "(" + radius+ "," + center+ ")";
	}
	public int compareTo(Circle cir)
	{
		if(radius==cir.radius){
			 return center.compareTo(cir.center);
		}else
			return radius-cir.radius;
	}


}
