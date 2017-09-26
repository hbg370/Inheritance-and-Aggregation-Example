
public class Rectangle extends Parallelogram {
	
	Rectangle(double p1, double p2, double p3, double p4, double p5, double p6, double p7, double p8)
	{
		super(p1, p2, p3, p4, p5, p6, p7, p8);
	}
	
	Rectangle(Point p1, Point p2, Point p3, Point p4)
	{
		super(p1, p2, p3, p4);
	}
	
	public double getHeight()
	{
		return Math.abs((getPoint1().getYcoord() - getPoint4().getYcoord()));
	}
	
	public double getWidth()
	{
		return Math.abs((getPoint1().getXcoord() - getPoint2().getXcoord()));	
	}
	
	public double getArea()
	{
		return (getHeight() * getWidth());
	}
	
	public String toString()
	{
		return ("Coordinates of Rectangle are:\n" + "(" + getPoint1().getXcoord() + ", "
		+ getPoint1().getYcoord() + ")" + ", " + "(" + getPoint2().getXcoord() + ", " + getPoint2().getYcoord() + ")"
		+ ", " + "(" + getPoint3().getXcoord() + ", " + getPoint3().getYcoord() + ")" + ", " + "(" + getPoint4().getXcoord() 
		+ ", " + getPoint4().getYcoord() + ")" + "\nHeight is: " + getHeight() + "\nWidth is: " + getWidth() + "\nArea is: " + getArea() + "\n");
		
	}

}
