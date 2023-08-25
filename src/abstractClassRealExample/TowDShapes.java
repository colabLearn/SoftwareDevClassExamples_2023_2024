package abstractClassRealExample;

public abstract class TowDShapes {
	//Common attributes
	protected String name;

	public TowDShapes(String name) {
		super();
		this.name = name;
	}
	
	abstract double calArea();
	abstract double calVolume();
	
	public void shapeInfo() {
		System.out.println("Shape: " + this.name);
		System.out.println("Area: " + calArea());
		System.out.println("Volume: " + calVolume());
	}
	
}
