package Week5;

import java.awt.Color;

public class Circle extends Shape {

	private double radius; //File peculiar to circle
	
	public Circle(Color lineColour, double lineTickness, double radius) {
		super(lineColour, lineTickness);  //Constructor from the parent class
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

	

}
