package Week5;

import java.awt.Color;

public class Rectangle extends Shape {
  
	private double width;     //peculiar to this rectangle class only
	private double height;    //peculiar to rectangle class only

		
	public Rectangle(Color lineColour, double lineTickness, double width, double height) {
		super(lineColour, lineTickness);  //Constructor from the parent class
		this.width = width;
		this.height = height;
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
