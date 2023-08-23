package Week5;

import java.awt.Color;

public class Main {
	public static void main(String[] args) {
		
		//Creating objects of Rectangle, Square and Circle
		
		Rectangle redRect =  new Rectangle(Color.red, 2.5, 2.5, 3.0);
		
		/*
		 * Creating blueSquare demonstrates the Liskov Substitution Principle:
		 * That every subclass or  derived class should be substitutable for their base or parent class.
		 * The derived class should always obey the contract of the interface it implements
		 */
		 Shape blueSquare = new Square(Color.blue, 1.5, 3.5);
		 
		 Circle pinkCircle = new Circle(Color.pink,2.5, 3);
		 
//		 System.out.println(redRect.getHeight());
//		 System.out.println(blueSquare.getLineTickness());
//		 System.out.println(pinkCircle.getLineColour());
//		 pinkCircle.setLineColour(Color.CYAN);
//		 System.out.println(pinkCircle.getLineColour());
		 
		 System.out.println(pinkCircle);
		 
		
	}
	

}
