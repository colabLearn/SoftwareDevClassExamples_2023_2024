package Week5;
import java.awt.Color;

public class Square {
	//Fields in square
	private Color  lineColour;      //Common to all the shapes
	private double lineTickness; 
	private double lengthOfSide; //peculiar to Square
	
//Consructors	
	
	public Square() {
		
	}
	public Square(Color lineColour,
		     double lineTickness, 
		     double lengthOfSide) 
{
	
	this.lineColour = lineColour;
	this.lineTickness = lineTickness;
	this.lengthOfSide = lengthOfSide;
}
	
//Getter and setters

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
	public double getLengthOfSide() {
		return lengthOfSide;
	}
	public void setLengthOfSide(double lengthOfSide) {
		this.lengthOfSide = lengthOfSide;
	}
	
	

}
