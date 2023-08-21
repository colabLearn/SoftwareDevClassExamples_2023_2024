package Week5;
import java.awt.Color;

public class Rectangle {
  //Fields of rectangle class
	private Color  lineColour;      //Common to all the shapes
	private double lineTickness;  //Common to all the shapes
	private double width;     //peculiar to this rectangle class only
	private double height;    //peculiar to rectangle class only
	

	public Rectangle() {
		
	}
	



	public Rectangle(Color lineColour, 
			double lineTickness, 
			double width,
			double height) 
	{
		this.lineColour = lineColour;
		this.lineTickness = lineTickness;
		this.width = width;
		this.height = height;
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

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	

	
}
