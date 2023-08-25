package abstractClassRealExample;

public abstract class TwoDShapes {
	//Common attributes
	protected String name;

	public TwoDShapes(String name) {
		super();
		this.name = name;
	}
	
	abstract double calArea();
	abstract double calPerimeter();
	
	public void shapeInfo() {
		System.out.println("Shape: " + this.name);
		System.out.println("Area: " + calArea());
		System.out.println("Volume: " + calPerimeter());
	}
	
}
