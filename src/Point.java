//x/y coordinates, get() and set() methods...
public class Point {
	private double xCoord, yCoord;
	
	Point(double x, double y)
	{
		xCoord = x;
		yCoord = y;
	}

	public double getXcoord()
	{
		return xCoord;
	}
	
	public double getYcoord()
	{
		return yCoord;
	}
	
	public void setXCoord(double x)
	{
		x = xCoord;
	}
	
	public void setYCoord(double y)
	{
		y = yCoord;
	}
}
