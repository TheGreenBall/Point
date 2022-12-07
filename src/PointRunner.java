//Comment out when creating your class
//import java.awt.Point;

public class PointRunner {
	public static void main(String args[]){

		Point a = new Point();
		a.x = -4;
		a.y = 4;
		System.out.println( "(" + a.getX() + "," + a.getY() + ")" );

		Point b = new Point(6,7);
		System.out.println(b);
		b.setLocation(3,4);
		System.out.println(b);

		Point c = new Point( b );
		//c.translate(1, -1);
		System.out.println(c);
	}
}
