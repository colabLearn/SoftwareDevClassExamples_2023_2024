package abstractClassRealExample;

public class Circle extends TwoDShapes{
	private static double PI = 3.142;
	private int radius;
	
	

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	double calArea() {
		// TODO Auto-generated method stub
		return PI*Math.pow(radius, 2);
	}

	@Override
	double calPerimeter() {
		// TODO Auto-generated method stub
		return 2*PI*this.radius;
	}
	
	

}
