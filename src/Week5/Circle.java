package Week5;
import java.awt.Color;

public class Circle {
	//Fields in Circle
	private Color  lineColour;      //Common to all the shapes
	private double lineTickness;  
	private double radius; //File peculiar to circle
	
	
	public Circle() {
		
	}


	public Circle(Color lineColour, double lineTickness, double radius) {
		this.lineColour = lineColour;
		this.lineTickness = lineTickness;
		this.radius = radius;
	}

	

}
