package abstractClassRealExample;

public class Rectangle extends TwoDShapes {
	private double length;
	private double width;
	
	
	
	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}
	
	@Override
	double calArea() {
		// TODO Auto-generated method stub
		return this.length*this.width;
	}
	@Override
	double calPerimeter() {
		// TODO Auto-generated method stub
		return 2*(this.length+this.width);
	}
}
