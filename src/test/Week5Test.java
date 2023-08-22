package test;
import Week5.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import java.awt.Color;

import org.junit.jupiter.api.Test;

public class Week5Test {
	
	private final Shape Rect_Test = new Rectangle(Color.green, 2.5, 1.5, 3);
	private final Circle circleTest = new Circle(Color.red, 2.4, 1.5);
	
	
	//This is to test polymorphism 
	@Test
	void testPolymorphism() {
		assertTrue(Rect_Test instanceof Shape);
		assertTrue(Rect_Test instanceof Rectangle);
	}
	
	@Test
	void testGetColor() {
		assertEquals(circleTest.getLineColour(), Color.red);
		circleTest.setLineColour(Color.BLUE);
		assertEquals(circleTest.getLineColour(), Color.BLUE);
	}

}
