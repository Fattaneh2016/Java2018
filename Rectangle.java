
public class Rectangle {	
	int width;
	int Height;
	int X;
	int Y;
	
	public void setfields(int newx,int newy,int newwidth,int newheight){

		X=newx;
		Y=newy;
		width=newwidth;
		Height=newheight;
	}
	
	public int getHeight(){

		return Height;
	}
	public int getWidth(){

		return width;
	}
	public int getX(){

		return X;
	}
	public int getY(){

		return Y;
	}
	public int getArea(){

		return width*Height;
	}

}
