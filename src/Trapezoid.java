

	public class Trapezoid extends Quadrilateral{
		
		/*instead of using "this()", use "super()" to initialize, invoking the
		 superclass's constructors first...
		 */
		Trapezoid(double p1, double p2, double p3, double p4, double p5, double p6, double p7, double p8)
		{
			super(p1, p2, p3, p4, p5, p6, p7, p8);
		}
		
		//same concept as above...
		Trapezoid(Point p1, Point p2, Point p3, Point p4)
		{
			super(p1, p2, p3, p4);
		}
		
		public double getSumOfTwoSides()
		{
			double a, b;
			a = Math.abs((getPoint1().getXcoord() - getPoint2().getXcoord()));
			b = Math.abs((getPoint3().getXcoord() - getPoint4().getXcoord()));
			return (a + b);
		}
		
		public double getHeight()
		{
			return (Math.abs((getPoint1().getYcoord() - getPoint4().getYcoord())));
		}
		
		public double getArea()
		{
			return((getSumOfTwoSides() /2) * getHeight());
		}
		
		public String toString()
		{
		return ("Coordinates of Trapezoid are:\n" + "(" + getPoint1().getXcoord() + ", "
		+ getPoint1().getYcoord() + ")" + ", " + "(" + getPoint2().getXcoord() + ", " + getPoint2().getYcoord() + ")"
		+ ", " + "(" + getPoint3().getXcoord() + ", " + getPoint3().getYcoord() + ")" + ", " + "(" + getPoint4().getXcoord() 
		+ ", " + getPoint4().getYcoord() + ")" + "\nHeight is: " + getHeight() + "\nArea is: " + getArea() + "\n");
		}

	}


