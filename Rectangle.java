public class Rectangle {	
	private int width;
	private int height;
	private int x;
	private int y;
	
	public void setfields(int newX,int newY,int newWidth,int newHeight){
		x=newX;
		y=newY;
		width=newWidth;
		height=newHeight;
	}	
	public Rectangle(int initialX, int initialY, int initialWidth, int initialHeight){		
		x=initialX;
		y=initialY;
		width=initialWidth;
		height=initialHeight;		
	}	
	public boolean contains(int x,int y){		
		if( this.x <=x && this.y<= y && (this.x + this.width)>= x && (this.y + this.height)>= y ){
			return true;
		}else {
			return false;
		}		
	}
	//returns a string such as {(5,12), 4x8}
	public String toString(){
		return "{( " + x + "," + y + ")" + "," + width + "x" + height + "}";
	}
	public int getHeight(){

		return height;
	}
	public int getWidth(){

		return width;
	}
	public int getX(){

		return x;
	}
	public int getY(){

		return y;
	}	
}
