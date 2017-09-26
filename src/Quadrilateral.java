
public class Quadrilateral {
	private Point point1, point2, point3, point4;
	
	//8 argueguements , 4 pairs of doubles, 1 pair per point object. Shapes are simply sets of points...
	Quadrilateral(double p1, double p2, double p3, double p4, double p5, double p6, double p7, double p8)
	{
		point1 = new Point(p1, p2);
		point2 = new Point(p3, p4);
		point3 = new Point(p5, p6);
		point4 = new Point(p7, p8);
	}
	
	Quadrilateral(Point p1, Point p2, Point p3, Point p4)
	{
		this.point1 = p1;
		this.point2 = p2;
		this.point3 = p3;
		this.point4 = p4;
	}
	
	public void setPoint1(double p1, double p2)
	{
		point1.setXCoord(p1);
		point1.setYCoord(p2);
	}
	
	public void setPoint2(double p3, double p4)
	{
		point2.setXCoord(p3);
		point2.setYCoord(p4);
	}
	
	public void setPoint3(double p5, double p6)
	{
		point3.setXCoord(p5);
		point3.setYCoord(p6);
	}
	
	public void setPoint4(double p7, double p8)
	{
		point4.setXCoord(p7);
		point4.setYCoord(p8);
		
	}
	
	public Point getPoint1()
	{
		return point1;
	}
	
	public Point getPoint2()
	{
		return point2;
	}
	
	public Point getPoint3()
	{
		return point3;
	}
	
	public Point getPoint4()
	{
		return point4;
	} 
	
	
	public String toString()
	{
		return ("Coordinates of Quadrilateral are:\n" + "(" + getPoint1().getXcoord() + ", "
				+ getPoint1().getYcoord() + ")" + ", " + "(" + getPoint2().getXcoord() + ", " + getPoint2().getYcoord() + ")"
				+ ", " + "(" + getPoint3().getXcoord() + ", " + getPoint3().getYcoord() + ")" + ", " + "(" + getPoint4().getXcoord() 
				+ ", " + getPoint4().getYcoord() + ")" + "\n");
	}
				

}

