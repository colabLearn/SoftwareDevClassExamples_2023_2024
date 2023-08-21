package Week5;

import java.awt.Color;

public class Square extends Shape {
	
	private double lengthOfSide; //peculiar to Square

	public Square(Color lineColour, double lineTickness, double lengthOfSide) {
		super(lineColour, lineTickness);  //Constructor from the parent class
		this.lengthOfSide = lengthOfSide;
	}
//Getter and setters

	public double getLengthOfSide() {
		return lengthOfSide;
	}
	public void setLengthOfSide(double lengthOfSide) {
		this.lengthOfSide = lengthOfSide;
	}
	
	

}
