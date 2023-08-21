package Week5;

import java.awt.Color;

public class Shape {
	//Shape has the common fields in Circle, Rectangle and Square.java
	private Color  lineColour;      
	private double lineTickness;
	
		
	public Shape(Color lineColour, double lineTickness) {
		
		this.lineColour = lineColour;
		this.lineTickness = lineTickness;
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
	
	

}
