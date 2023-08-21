package Week5;
import java.awt.Color;

public class Circle {
	//Fields in Circle
	private Color  lineColour;      //Common to all the shapes
	private double lineTickness;  
	private double radius; //File peculiar to circle
	

	public Circle() {
		super();
	}


	public Circle(Color lineColour,
			   double lineTickness, 
			   double radius) 
	{
		
		this.lineColour = lineColour;
		this.lineTickness = lineTickness;
		this.radius = radius;
	}


	public Color getLineColour() {
		return lineColour;
	}


	public void setLineColour(Color lineColour) {
		this.lineColour = lineColour;
	}


	public double getLineTickness() {
		return lineTickness;
	}


	public void setLineTickness(double lineTickness) {
		this.lineTickness = lineTickness;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

	

}
