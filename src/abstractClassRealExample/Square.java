package abstractClassRealExample;

public class Square extends TwoDShapes {
	private double sideLength;
	
	

	public Square(String name, double sideLength) {
		super(name);
		this.sideLength = sideLength;
	}

	@Override
	double calArea() {
		// TODO Auto-generated method stub
		return Math.pow(sideLength, 2);
	}

	@Override
	double calPerimeter() {
		// TODO Auto-generated method stub
		return 4*this.sideLength;
	}
	
	
	
}
