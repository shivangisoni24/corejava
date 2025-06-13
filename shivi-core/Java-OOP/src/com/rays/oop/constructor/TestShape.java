package com.rays.oop.constructor;

public class TestShape {
	
	public static void main(String[] args) {
		
		System.out.println("----CIRCLE----");
		Circle c = new Circle(2);
		
		System.out.println("radius : " + c.getRadius());
		System.out.println("area of circle : " + c.area());
		
		
		System.out.println("----RECTANGLE----");
		Rectangle r = new Rectangle(3,4);
		
		System.out.println("length : " + r.getLength());
		System.out.println("width : " + r.getWidth());
		System.out.println("area of rectangle : " + r.area());

	
	
	    System.out.println("----TRIANGLE----");
	    Triangle t = new Triangle(4,5);
	    
	    System.out.println("base : " + t.getBase());
	    System.out.println("height : " + t.getHeight());
	    System.out.println("area of triangle : " + t.area());
	
	}

}
