package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

import coordinate.Point;

/********************************************************
 * This is a test class for Point.
 ********************************************************/
public class PointUnitTest {
	
	//TEST: Two Point objects
	 Point p1;
	 Point p2;
	 
	/*****************************************************
	 * Test method for {@link coordinate.Point#Point()}.
	 *****************************************************/
	@Test
	void testPoint() {
		System.out.println();
		System.out.println("----------BEGIN: testConstructor() -----------");
		
		//TEST: empty reference
		assertNull(p1);
		
		//ASSIGN: test Point object
		p1 = new Point(1, 1);
		
		//TEST: constructor Point()
		assertEquals(1, p1.getX());
		assertEquals(1, p1.getY());
		
		//CHECK: contents of Point object
		System.out.println("test p1 at origin: " + p1);
		System.out.println("----------BEGIN: testConstructor() -----------");
	}

	/*********************************************************************
	 * Test method for {@link coordinate.Point#Point(coordinate.Point)}.
	 *********************************************************************/
	@Test
	void testPointPoint() {
		System.out.println();
		System.out.println("----------BEGIN: testConstructorPoint() -----------");		
		
		//TEST: empty reference
		assertNull(p1);
		
		//ASSIGN: test Point object(s)
		p2 = new Point(2, 5);
		p1 = new Point(p2);
		
		//TEST: constructor Point(Point)
		assertEquals(2, p1.getX());
		assertEquals(5, p1.getY());
		
		//CHECK: contents of Point object
		System.out.println("point: " +  p2);
		System.out.println("copy:  " +  p1);
		System.out.println("SUCCESS: @END");
		System.out.println("----------END: testConstructorPoint() -----------");
	}

	/*************************************************************
	 * Test method for {@link coordinate.Point#Point(int, int)}.
	 *************************************************************/
	@Test
	void testPointIntInt() {
		System.out.println();
		System.out.println("----------BEGIN: testConstructorIntInt() -----------");	
		
		//TEST: empty reference
		assertNull(p1);
		
		//ASSIGN: test Point object
		p1 = new Point(1, 4);
		
		//TEST: constructor Point(x, y)
		assertEquals(1, p1.getX());
		assertEquals(4, p1.getY());
		
		//CHECK: contents of Point object
		System.out.println("point (x,y): " + p1);
		System.out.println("SUCCESS: @END");
		System.out.println("----------END: testConstructorIntInt() -----------");
	}
	
	/************************************************************************
	 * Test method for {@link coordinate..Point#distanceFromOrigin()}.
	 ************************************************************************/
	@Test
	void testDistanceFromOrigin() {
		System.out.println();
		System.out.println("----------BEGIN: testDistanceFromOrigin() -----------");	
		
		//TEST: empty reference
		assertNull(p1);
		
		//ASSIGN: test Point object
		p1 = new Point(3, 4);
		p2 = new Point(5, 12);
		
		double distFromOrig1 = p1.distanceFromOrigin();
		double distFromOrig2 = p2.distanceFromOrigin();
		
		//TEST: constructor Point(x, y)
		assertEquals(5.0 , distFromOrig1);
		assertEquals(13.0, distFromOrig2);
		
		//CHECK: contents of Point objects
		System.out.println("Distance From Origin 1: " + distFromOrig1);
		System.out.println("Distance From Origin 2: " + distFromOrig2);
		System.out.println("SUCCESS: @END");
		System.out.println("----------END: testDistanceFromOrigin() -----------");
	}

	
	/************************************************************************
	 * Test method for {@link coordinate..Point#distance(Point)}.
	 ************************************************************************/
	@Test
	void testDistance() {
		System.out.println();
		System.out.println("----------BEGIN: testDistance() -----------");	
		
		//TEST: empty reference
		assertNull(p1);
		
		//ASSIGN: test Point object
		p1 = new Point(1, 2);
		p2 = new Point(4, 6);
		
		
		//TEST: constructor Point(x, y)
		assertEquals(5.0 , p2.distance(p1));
		assertEquals(5.0 , p1.distance(p2));
		
		//CHECK: contents of Point objects
		System.out.println("Distance : " + p2.distance(p1));
		System.out.println("Distance : " + p1.distance(p2));
		System.out.println("SUCCESS: @END");
		System.out.println("----------END: testDistance() -----------");
	}

	/********************************************************
	 * Test method for {@link coordinate.Point#equals(Object)}.
	 ********************************************************/
	@Test
	void testEquals() {
		
		System.out.println();
		System.out.println("----------BEGIN: testEquals() -----------");
		
		//TEST: empty reference(s)
		assertNull(p1);
		assertNull(p2);
		
		//ASSIGN: test Point object
		p1          = new Point(3, 8);
		p2          = new Point(2, 5);
		Point other = new Point(3, 8);
		
		//TEST: equals method
		assertEquals(p1, other);
		assertNotEquals(p1, p2);
		
		//CHECK: contents of Point object
		System.out.println("test Point 1:     " + p1);
		System.out.println("test Point 2:     " + p2);
		System.out.println("test Point other: " + other);
		System.out.println("SUCCESS: @END");
		System.out.println("---------- END: testEquals() -----------");
	}
	

	/********************************************************
	 * Test method for {@link coordinate.Point#flip()}.
	 ********************************************************/
	@Test
	void testFlip() {
		System.out.println();
		System.out.println("|--------BEGIN: testFlip()--------|");
		
		//ASSIGN: test Point object
		Point p1 = new Point(5, -3);
		System.out.println("\tvalue before:          " + p1);
		
		//MODIFY: Point object
		p1.flip();
		
		//TEST: flip method
		assertEquals(3,  p1.getX());
		assertEquals(-5, p1.getY());

		//CHECK: contents of Point object
		System.out.println("\tvalue after flip:      " + p1);
		System.out.println("SUCCESS: @END");
		System.out.println("|--------END: testFlip()----------|");	
	}
	
	/********************************************************
	 * Test method for {@link coordinate.Point#getX()}.
	 ********************************************************/
	@Test
	void testGetX() {
		System.out.println();
		System.out.println("|--------BEGIN: testGetX()--------|");
		
		//TEST: empty reference
		assertNull(p1);
		
		//ASSIGN: test Point object
		p1 = new Point(6, 0);
		
		//TEST: getX method
		assertEquals(6, p1.getX());
		
		//CHECK: contents of Point object
		System.out.println("test getX: " + p1);
		System.out.println("SUCCESS: @END");
		System.out.println("|--------END: testGetX()--------|");
	}

	/********************************************************
	 * Test method for {@link coordinate.Point#getY()}.
	 ********************************************************/
	@Test
	void testGetY() {
		System.out.println();
		System.out.println("|--------BEGIN: testGetY()--------|");
		
		//TEST: empty reference
		assertNull(p1);
		
		//ASSIGN: test Point object
		p1 = new Point(0, 6);
		
		//TEST: getY method
		assertEquals(6, p1.getY());
		
		//CHECK: contents of Point object
		System.out.println("test getY: " + p1);
		System.out.println("SUCCESS: @END");
		System.out.println("|--------END: testGetY()--------|");
	}

	/***************************************************************
	 * Test method for {@link plane.Line#isCollinear(plane.Point)}.
	 ***************************************************************/
	@Test
	void testIsCollinear() {
		System.out.println();
		System.out.println("|--------BEGIN: testIsCollinear()--------|");
		
		//ASSIGN: test Point object(s)
		Point p1   	= new Point(3, 3);
		Point p2 	= new Point(5, 5);
		Point p3 	= new Point(7, 7);		
		Point p4 	= new Point(4, 7);	
		
		System.out.println("Point(s) under TEST: ");
		System.out.println("\tPoint 1:   " + p1);
		System.out.println("\tPoint 2:   " + p2);
		System.out.println("\tPoint 3:   " + p3);
		System.out.println("\tPoint 4:   " + p4);
		
		//TEST:isCollinear
		assertTrue(p1.isCollinear(p2,p3));
		
		//TEST:invalid isCollinear
		assertFalse(p1.isCollinear(p2,p4));
		
		//CHECK:contents of Point object
		System.out.println("\tTest for Point on line:     " + p1.isCollinear(p2,p3));
		System.out.println("\tTest for Point not on line: " + p1.isCollinear(p2,p4));
		System.out.println("|--------END: testIsCollinear()---------|");
	}
	
	/***************************************************************
	 * Test method for {@link coordinate.Point#isVertical(coordinate.Point)}.
	 ***************************************************************/
	@Test
	void testIsVertical() {
		System.out.println();
		System.out.println("|--------BEGIN: testIsVertical()--------|");
		
		//ASSIGN: test Point object(s)
		Point p1   	= new Point(2, 3);
		Point p2 	= new Point(2, 6);
		Point p3 	= new Point(5, 3);		
		
		System.out.println("Point(s) under TEST: ");
		System.out.println("\tPoint 1:   " + p1);
		System.out.println("\tPoint 2:   " + p2);
		System.out.println("\tPoint 3:   " + p3);
		
		//TEST:isVertical
		assertTrue(p1.isVertical(p2));
		assertTrue(p1.isVertical(p1));
		
		//TEST:invalid isVertical
		assertFalse(p1.isVertical(p3));
		
		//CHECK:contents of Point object
		System.out.println("\tTest for Point line verticall:     	" +  p1.isVertical(p2));
		System.out.println("\tTest for Point line not vertically : 	" +  p1.isVertical(p3));
		System.out.println("|--------END: testIsVertical()---------|");
	}
	
	/***************************************************************
	 * Test method for {@link coordinate.Point#quadrant()}.
	 ***************************************************************/
	@Test
	void testQuadrant() {
		System.out.println();
		System.out.println("|--------BEGIN: testQuadrant()--------|");
		
		//ASSIGN: test Point object(s)
		Point p1   	= new Point( 81,   21);
		Point p2 	= new Point(-52,   32);
		Point p3 	= new Point(-93,   -1);	
		Point p4    = new Point( 64,  -44);
		Point p5	= new Point(  0,	0);
		
		System.out.println("Point(s) under TEST: ");
		System.out.println("\tPoint 1:   " + p1);
		System.out.println("\tPoint 2:   " + p2);
		System.out.println("\tPoint 3:   " + p3);
		System.out.println("\tPoint 2:   " + p4);
		System.out.println("\tPoint 3:   " + p5);
		
		//TEST: Quadrant method
		assertEquals(1, p1.quadrant());
		assertEquals(2, p2.quadrant());
		assertEquals(3, p3.quadrant());
		assertEquals(4, p4.quadrant());
		assertEquals(0, p5.quadrant());
		
		
		//CHECK:contents of Point object
		//CHECK: contents of Point object
		System.out.println("\ttest quadrant: " + p1.quadrant());
		System.out.println("\ttest quadrant: " + p2.quadrant());
		System.out.println("\ttest quadrant: " + p3.quadrant());
		System.out.println("\ttest quadrant: " + p4.quadrant());
		System.out.println("\ttest quadrant: " + p5.quadrant());
		System.out.println("SUCCESS: @END");
		System.out.println("|--------END: testQuadrant()--------|");
	}
	
	
	/************************************************************
	 * Test method for {@link coordinate.Point#setLocation(int, int)}.
	 ************************************************************/
	@Test
	void testSetLocationIntInt() {
		System.out.println();
		System.out.println("|------BEGIN: testSetLocationIntInt()------|");
	
		//TEST: empty reference
		assertNull(p1);
		
		//ASSIGN: test Point object
		p1 = new Point();
		System.out.println("\tvalue before:  " + p1);
		
		//MODIFY: Point object
		p1.setLocation(4, 9);
		
		//TEST: setLocation method
		assertEquals(4, p1.getX());
		assertEquals(9, p1.getY());
		
		//CHECK: contents of Point object
		System.out.println("\tvalue after:   " + p1);
		System.out.println("|------END: testSetLocationIntInt()------|");
	}

	
	/***********************************************************
	 * Test method for Exceptions.
	 ***********************************************************/
	@Test
	void testSlope() {
		System.out.println();
		System.out.println("----------BEGIN: testSlope() -----------");
		
		//TEST: empty reference
		assertNull(p1);
		
		//ASSIGN: test Point object
		p1 = new Point(0, 2);
		p2 = new Point(0, 4);
		
		//TEST: failure of precondition exception
		assertThrows(IllegalArgumentException.class, () -> p1.slope(p2));
		System.out.println("SUCCESS: @END");
		System.out.println("----------END: testSlope() -----------");
	}
	
	
	/********************************************************
	 * Test method for {@link coordinate.Point#toString()}.
	 ********************************************************/
	@Test
	void testToString() {
		System.out.println("|--------BEGIN: testToString()--------|");	
		
		//TEST: empty reference
		assertNull(p1);
		
		p1 = new Point(5, 3);
		
		//TEST: toString method
		assertEquals(5, p1.getX());
		assertEquals(3, p1.getY());
		
		//CHECK: contents of Point object
		System.out.println("\ttest toString: " + p1);
		System.out.println("SUCCESS: @END");
		System.out.println("|--------END: testToString()---------|");
	}
	
	/******************************************************************
	 * Test method for {@link coordinate.Point#translate(int, int)}.
	 ******************************************************************/
	@Test
	void testTranslate() {
		System.out.println();
		System.out.println("|--------BEGIN: testmove()--------|");
		
		//TEST: empty reference
		assertNull(p1);
		
		//ASSIGN: test Point object
		p1 = new Point();
		System.out.println("\tvalue before:          " + p1);
		
		//MODIFY: Point object
		p1.setLocation(2, 3);
		System.out.println("\tvalue after set:       " + p1);
		p1.translate(4, 1);
	
		//TEST: translate method
		assertEquals(6, p1.getX());
		assertEquals(4, p1.getY());
		
		//CHECK: contents of Point object
		System.out.println("\tvalue after translate: " + p1);
		System.out.println("|--------END: testmove()----------|");	
	}
	

}
