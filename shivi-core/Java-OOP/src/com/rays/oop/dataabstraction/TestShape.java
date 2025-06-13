package com.rays.oop.dataabstraction;

public class TestShape {

	public static void main(String[] args) {
		
		// Circle c = new Circle();
		
//		Shape s = new Circle();
		
		System.out.println("---------BY Type casting-------");
		
		Circle c = new Circle();
		c.setRadius(2);
		System.out.println("Radius is  " + c.getRadius());
		System.out.println("Area of Circle is " + c.area());
		
		Rectangle r = new Rectangle();
		r.setLength(5);
		r.setWidth(3);
		System.out.println("Length is " + r.getLength());
		System.out.println("Width is " + r.getWidth());
		System.out.println("Area of Rectangle is " + r.area());
		
		Triangle t = new Triangle();
		t.setBase(4);
		t.setHeight(2);
		System.out.println("Base is " + t.getBase());
        System.out.println("Height is " + t.getHeight());
        System.out.println("Area of Triangle is  " + t.area());
	
  }
}
