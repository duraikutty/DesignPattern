package factorypattern;

class Point {
	private double x,y;

	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public static Point newCartesianPoint(double x,double y) {
		return new Point(x,y);
	}
	
	public static Point newPolarPoint(double rho,double theta) {
		return new Point(rho*Math.cos(theta),rho*Math.sin(theta));
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}


public class FactoryPatternDemo {

	public static void main(String[] args) {
		Point p = Point.newPolarPoint(1,2);
		System.out.println(p);
	}

}
