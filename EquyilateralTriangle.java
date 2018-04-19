
public class EquyilateralTriangle implements Translate {

	private int x;
	private int y;
	private int l;	
	//area  A=bh/2   b=base h= height

	public EquyilateralTriangle(int initX,int initY ,int initL){

		this.x=initX;
		this.y=initY;
		this.l=initL;			
	}			
	public void move(int x, int y) {		
		
		this.x+=x;
		this.y+=y;
	}

	public double size() {
		return x;
	}

	public double area() {

		return (l*x)/2;
	}

	public void printShape() {

		System.out.println("This is a Triangle with one vertex at loaction XX ,YY " + x +" "+ y + " Area " + area() + " size " + size());
	}
	
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}

}
