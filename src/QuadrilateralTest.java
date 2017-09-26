
public class QuadrilateralTest {

	public static void main(String[] args) {
		System.out.println("1st test (same as sample run)");
		System.out.println("------------------------------");
		Quadrilateral q1 = new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);
		Trapezoid z1 = new Trapezoid(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);
		Rectangle r1 = new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0);
		Parallelogram p1 = new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);
		Square s1 = new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);	
		
		System.out.println(q1.toString());
		System.out.println(z1.toString());
		System.out.println(p1.toString());
		System.out.println(s1.toString());
		System.out.println(r1.toString());
		
		
		System.out.println("2nd test");
		System.out.println("------------------------------");
		Quadrilateral q2 = new Quadrilateral(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);
		Trapezoid z2 = new Trapezoid(0.1, 0.1, 12.0, 0.1, 9.0, 6.0, 4.0, 6.0);
		Rectangle r2 = new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0);
		Parallelogram p2 = new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);
		Square s2 = new Square(8.0, 0.0, 16.0, 0.0, 16.0, 8.0, 8.0, 8.0);
		
		System.out.println(q2.toString());
		System.out.println(z2.toString());
		System.out.println(p2.toString());
		System.out.println(s2.toString());
		System.out.println(r2.toString());
		
	
	
		Point pt1 = new Point(5.0, 10.0);
		Point pt2 = new Point(4.0, 5.0);
		Point pt3 = new Point(6.0, 15.0);
		Point pt4 = new Point(10.0, 20.0);
		
		
		System.out.println("Testing of point objects (proof of aggregation)");
		System.out.println("pt1: (" +  pt1.getXcoord() + ", " + pt1.getYcoord() + ")");
		System.out.println("pt2: (" +  pt2.getXcoord() + ", " + pt2.getYcoord() + ")");
		System.out.println("pt3: (" +  pt3.getXcoord() + ", " + pt3.getYcoord() + ")");
		System.out.println("pt4: (" +  pt4.getXcoord() + ", " + pt4.getYcoord() + ")");



	}

}
